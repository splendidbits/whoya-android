package com.splendidbits.whoya.activity

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import com.splendidbits.whoya.R
import com.splendidbits.whoya.fragment.HistoryFragment
import com.splendidbits.whoya.helper.PERMISSION_REQUEST_CODE
import com.splendidbits.whoya.helper.PermissionsHelper
import com.splendidbits.whoya.main.WhoyaApplication
import javax.inject.Inject


class HostActivity : AppCompatActivity(), LifecycleObserver {
    @Inject
    lateinit var permissionsHelper: PermissionsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WhoyaApplication.graph.inject(this)
        setContentView(R.layout.activity_host)

        PermissionsHelper().requestCallLogPermission(this)

        // Sets transparent navigation controls
        window.addFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS and
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS and
                    WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS
        )

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        val callHistoryFragment = HistoryFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_fragment_container, callHistoryFragment)
            .attach(callHistoryFragment)
            .commit()

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSION_REQUEST_CODE -> {
                // If request is cancelled, the result arrays are empty.
                if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    // permission was granted, yay!
                } else {
                    // permission denied, boo!
                }
                return
            }
        }
    }
}