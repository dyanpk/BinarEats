package com.hungry.binareats

import android.app.Application
import com.hungry.binareats.data.local.database.AppDatabase

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getInstance(this)
    }
}