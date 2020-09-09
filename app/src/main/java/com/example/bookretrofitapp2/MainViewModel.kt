package com.example.bookretrofitapp2

import androidx.lifecycle.ViewModel
import retrofit2.Retrofit

class MainViewModel(private val repo: BookRepository, private val key: String): ViewModel() {

 /*   private fun getRetrofitInstance(): Retrofit {
        return RetrofitInstance.getRetrofitInstance()
    }

    private fun createApiService() : IBookService {
        return getRetrofitInstance().create(IBookService::class.java)
    }

    suspend fun getBooks() : Books {
        return createApiService().loadBooks(key)
    }*/

    suspend fun getBooksFromRepo() : Books{
        return repo.getBooks(key)
    }
}