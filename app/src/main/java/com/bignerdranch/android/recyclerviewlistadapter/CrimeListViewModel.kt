package com.bignerdranch.android.recyclerviewlistadapter

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.recyclerviewlistadapter.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}