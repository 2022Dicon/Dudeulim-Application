package com.example.dudeulimproject.data.request

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginRequest(
    val token : String
)
