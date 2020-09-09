package com.example.bookretrofitapp2

import com.google.gson.annotations.SerializedName

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