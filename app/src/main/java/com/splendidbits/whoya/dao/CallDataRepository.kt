package com.splendidbits.whoya.dao

import android.content.Context
import android.provider.CallLog
import android.telephony.PhoneNumberUtils
import androidx.lifecycle.MutableLiveData
import com.splendidbits.whoya.model.CallData
import com.splendidbits.whoya.model.CallType
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.util.*


class CallDataRepository(val context: Context) {
    val MAX_ENTIRES_TO_FETCH = 50

    /**
     * Get a list of
     * @return A LiveData list of CallLog entries
     */
    fun getCallHistory() = runBlocking {
        val ROW_INDEX_NAME = 0
        val ROW_INDEX_NUMBER = 1
        val ROW_INDEX_TYPE = 2
        val ROW_INDEX_TIME = 3

        async {
            val rows = arrayOf(
                CallLog.Calls.CACHED_NAME,
                CallLog.Calls.NUMBER,
                CallLog.Calls.TYPE,
                CallLog.Calls.DATE
            )

            val sortOrder = CallLog.Calls.DATE + " DESC"
            val cursor = context.getContentResolver().query(
                CallLog.Calls.CONTENT_URI,
                rows,
                null,
                null,
                sortOrder)

            val callDataList= mutableListOf<CallData>()

            while (callDataList.count() < (MAX_ENTIRES_TO_FETCH +1) && cursor?.moveToNext() ?: false) {
                val name = cursor?.getString(ROW_INDEX_NAME)
                val number = cursor?.getString(ROW_INDEX_NUMBER)
                val type = cursor?.getString(ROW_INDEX_TYPE)
                val epoch = cursor?.getString(ROW_INDEX_TIME)

                val enumType = when(type?.toInt()) {
                    3 -> CallType.CALL_INCOMING
                    2 -> CallType.CALL_OUTGOING
                    else -> CallType.CALL_MISSED
                }

                val formattedNumber = PhoneNumberUtils.formatNumberToE164(number, "US")
                val newNumber = if (!formattedNumber.isNullOrBlank()) {
                    formattedNumber
                } else {
                    PhoneNumberUtils.formatNumber(number, "US")
                }


                val date = Date()
                date.time = epoch?.toLong() ?: date.time

                callDataList.add(CallData(
                    name = name ?: "",
                    type = enumType,
                    date = date,
                    number = newNumber ?: ""
                ))
            }
            cursor?.close()

            val callData = MutableLiveData<List<CallData>>()
            callData.postValue(callDataList)

            callData
        }
    }
}