package com.example.bookretrofitapp2.Domain

import com.google.gson.annotations.SerializedName

//TODO: Domain classes created automatically with help of  "Kotlin Data class From JSON" plugin
data class Result(
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("list_name")
    val listName: String,
    @SerializedName("list_name_encoded")
    val listNameEncoded: String,
    @SerializedName("newest_published_date")
    val newestPublishedDate: String,
    @SerializedName("oldest_published_date")
    val oldestPublishedDate: String,
    @SerializedName("updated")
    val updated: String
)