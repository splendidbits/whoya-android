package com.splendidbits.whoya.view

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_holder_call_log.view.*

class CallHistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name: AppCompatTextView = itemView.call_log_name_view
    val number: AppCompatTextView = itemView.call_log_number_view
    val type: AppCompatTextView = itemView.call_log_type
    val time: AppCompatTextView = itemView.call_log_date
}