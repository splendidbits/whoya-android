package com.splendidbits.whoya.helper

import android.Manifest
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity


const val PERMISSION_REQUEST_CODE = 202
class PermissionsHelper {

    fun requestCallLogPermission(activity: FragmentActivity) {
        ActivityCompat.requestPermissions(activity,
            arrayOf(Manifest.permission.READ_CALL_LOG),
            PERMISSION_REQUEST_CODE)
    }

    fun hasCallLogPermission(activity: FragmentActivity): Boolean {
        return ContextCompat.checkSelfPermission(activity,
            Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED
    }
}