//package com.example.cryptogecon
//
//import android.app.Application
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//
//class FirstFactory(val application: Application, val text: String):
//    ViewModelProvider.AndroidViewModelFactory(application) {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return FirstViewModel(application, text) as T
//    }
//}