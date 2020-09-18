package com.example.bookretrofitapp2.Presenter

import androidx.lifecycle.ViewModel
import com.example.bookretrofitapp2.Data.Repositories.BookRepository
import com.example.bookretrofitapp2.Domain.Books

//TODO: I don't know if I selected the package right
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

    suspend fun getBooksFromRepo() : Books {
        return repo.getBooks(key)
    }
}