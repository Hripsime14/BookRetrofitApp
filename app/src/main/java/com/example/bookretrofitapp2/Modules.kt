package com.example.bookretrofitapp2

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    fun provideRetrofit(factory: Gson): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/lists/")
            .addConverterFactory(GsonConverterFactory.create(factory))
            .build()
    }

    single {
        provideGson()
    }

    single {
        provideRetrofit(get())
    }
}