package com.example.learnlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val countLiveData = MutableLiveData<Int>()
    val counterLiveData: LiveData<Int>
        get() = countLiveData

    init {
        countLiveData.value = 0
    }


    fun incrementCounter() {
        countLiveData.value = (countLiveData.value ?: 0) + 1
    }
}