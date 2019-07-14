package com.splendidbits.whoya.model

import java.util.*

data class CallData(
    val name: String,
    val type: CallType,
    val number: String,
    val date: Date
)
