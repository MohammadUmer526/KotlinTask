package com.muhammadumer.kotlintask.injection.component

import dagger.Component
import com.muhammadumer.kotlintask.injection.module.NetworkModule
import com.muhammadumer.kotlintask.ui.post.PostListViewModel
import com.muhammadumer.kotlintask.ui.post.PostViewModel
import javax.inject.Singleton

// methods for presenter
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

     // injects required dependencies into PostListViewModel.

    fun inject(postListViewModel: PostListViewModel)

    // injects the required dependencies into PostViewModel

    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}