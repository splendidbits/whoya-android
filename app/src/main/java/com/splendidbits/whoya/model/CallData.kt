package com.splendidbits.whoya.model

data class CallData(
    val id: Long,
    val name: String,
    val type: CallType,
    val number: String,
    val date: String
)
