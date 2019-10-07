package com.muhammadumer.kotlintask.ui.post

import android.arch.lifecycle.MutableLiveData
import com.muhammadumer.kotlintask.base.BaseViewModel
import com.muhammadumer.kotlintask.model.Post


open class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    // model class to get title and body
    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

}