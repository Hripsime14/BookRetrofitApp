package com.example.bookretrofitapp2

import android.app.Application
import com.example.bookretrofitapp2.Modules.apiModule
import com.example.bookretrofitapp2.Modules.repositoryModule
import com.example.bookretrofitapp2.Modules.retrofitModule
import com.example.bookretrofitapp2.Modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() { //TODO: I don't know which package put App class

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(viewModelModule, repositoryModule, apiModule, retrofitModule))
        }
    }
}