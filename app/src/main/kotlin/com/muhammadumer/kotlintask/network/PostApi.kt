package com.muhammadumer.kotlintask.network

import io.reactivex.Observable
import com.muhammadumer.kotlintask.model.Post
import retrofit2.http.GET

//  interface which provides endpoints to get/post from webservice
interface PostApi {

    // get the list of post
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}