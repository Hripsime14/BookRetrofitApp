package com.example.bookretrofitapp2.Modules

import com.example.bookretrofitapp2.Data.Repositories.BookRepository
import com.example.bookretrofitapp2.Data.IBookService
import com.example.bookretrofitapp2.Presenter.MainViewModel
import com.example.bookretrofitapp2.Data.RetrofitInstance
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

//TODO: Is it okay, to put all the modules in 1 file?

val viewModelModule = module {
    /*viewModel {
        MainViewModel("ryOX7WaLMNT9uclXL53TkYHMcYkQTYFa")
    }*/

    viewModel {
        MainViewModel(get(), "ryOX7WaLMNT9uclXL53TkYHMcYkQTYFa")
    }

}

val repositoryModule = module {
    single {
        BookRepository(get())
    }
}

val apiModule = module {
    fun provideBookApi(retrofit: Retrofit): IBookService {
        return retrofit.create(IBookService::class.java)
    }

    single {
        provideBookApi(get())
    }
}

val retrofitModule = module {
    single {
        RetrofitInstance.getRetrofitInstance()
    }
}