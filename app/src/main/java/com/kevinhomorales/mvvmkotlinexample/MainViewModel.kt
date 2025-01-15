package com.kevinhomorales.mvvmkotlinexample

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    fun upperCase(text: String): String {
        return text.uppercase()
    }
}