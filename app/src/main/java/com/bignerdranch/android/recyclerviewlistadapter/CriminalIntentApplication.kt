package com.bignerdranch.android.recyclerviewlistadapter

import android.app.Application
import com.bignerdranch.android.recyclerviewlistadapter.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}