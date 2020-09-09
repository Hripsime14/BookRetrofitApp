package com.example.bookretrofitapp2

class BookRepository(private val api: IBookService) {
    suspend fun getBooks(key: String) : Books {
        return api.loadBooks(key)
    }
}