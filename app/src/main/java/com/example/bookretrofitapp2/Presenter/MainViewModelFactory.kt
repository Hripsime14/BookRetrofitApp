package com.example.bookretrofitapp2.Presenter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

//TODO:because of koin integration, no need of this Factory class(passing ViewModel arguments from modules)

class MainViewModelFactory(private val key: String): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            return MainViewModel(key) as T
        }
        throw IllegalArgumentException("Class not found")
    }
}