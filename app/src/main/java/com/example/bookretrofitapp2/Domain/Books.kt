package com.example.bookretrofitapp2.Domain

import com.example.bookretrofitapp2.Domain.Result
import com.google.gson.annotations.SerializedName
//TODO: Domain classes created automatically with help of  "Kotlin Data class From JSON" plugin
data class Books(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("num_results")
    val numResults: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("status")
    val status: String
)