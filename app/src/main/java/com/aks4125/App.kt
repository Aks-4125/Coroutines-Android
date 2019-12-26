package com.aks4125

import android.app.Application
import com.aks4125.di.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        //required
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(retrofitModule)
        }
    }


}