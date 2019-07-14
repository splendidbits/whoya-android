package com.splendidbits.whoya.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.splendidbits.whoya.R
import com.splendidbits.whoya.model.CallData
import com.splendidbits.whoya.model.CallType
import com.splendidbits.whoya.view.CallHistoryViewHolder


class HistoryRecyclerAdapter(val context: Context) : RecyclerView.Adapter<CallHistoryViewHolder>() {
    val callDataList: MutableList<CallData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHistoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(com.splendidbits.whoya.R.layout.view_holder_call_log, parent, false)
        return CallHistoryViewHolder(itemView)
    }

    override fun getItemId(position: Int): Long {
        return callDataList.get(position).date.time
    }

    override fun setHasStableIds(hasStableIds: Boolean) {
        super.setHasStableIds(true)
    }

    override fun onBindViewHolder(viewHolder: CallHistoryViewHolder, position: Int) {
        val item = callDataList.get(position)
        viewHolder.name.text = context.getString(R.string.call_unknown_number)
        viewHolder.number.text = item.number

        when(item.type) {
            CallType.CALL_INCOMING ->
                viewHolder.type.text = context.getString(R.string.call_type_incoming)
            CallType.CALL_OUTGOING->
                viewHolder.type.text = context.getString(com.splendidbits.whoya.R.string.call_type_outgoing)
            CallType.CALL_MISSED->
                viewHolder.type.text = context.getString(com.splendidbits.whoya.R.string.call_type_missed)
        }
    }

    override fun getItemCount(): Int {
        return callDataList.count()
    }

    fun addCallData(callData: List<CallData>) {
        callDataList.addAll(callData)
        notifyDataSetChanged()
    }
}