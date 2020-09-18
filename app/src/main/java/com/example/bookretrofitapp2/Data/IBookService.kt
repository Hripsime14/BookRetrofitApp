package com.example.bookretrofitapp2.Data

import com.example.bookretrofitapp2.Domain.Books
import com.example.bookretrofitapp2.Domain.Result
import retrofit2.http.GET
import retrofit2.http.Query

interface IBookService {

    @GET("names.json")
    suspend fun loadBooks(@Query("api-key") key: String) : Books

    @GET("names.json?api-key=ryOX7WaLMNT9uclXL53TkYHMcYkQTYFa")
    suspend fun loadBooks() : Books

    @GET("overview/2019-01-20.json?api-key=ryOX7WaLMNT9uclXL53TkYHMcYkQTYFa")
    suspend fun loadResult() : Result

}