package com.example.bookretrofitapp2.Data.Repositories

import com.example.bookretrofitapp2.Data.IBookService
import com.example.bookretrofitapp2.Domain.Books

class BookRepository(private val api: IBookService) {
    suspend fun getBooks(key: String) : Books {
        return api.loadBooks(key)
    }
}