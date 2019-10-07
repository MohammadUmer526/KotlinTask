package com.muhammadumer.kotlintask.base

import android.arch.lifecycle.ViewModel
import com.muhammadumer.kotlintask.injection.component.DaggerViewModelInjector

import com.muhammadumer.kotlintask.injection.component.ViewModelInjector
import com.muhammadumer.kotlintask.injection.module.NetworkModule
import com.muhammadumer.kotlintask.ui.post.PostListViewModel
import com.muhammadumer.kotlintask.ui.post.PostViewModel

abstract class BaseViewModel:ViewModel(){

    // initializing Dagger
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }


    // inject the require dependency

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}