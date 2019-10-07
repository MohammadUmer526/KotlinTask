package com.muhammadumer.kotlintask.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface PostDao {

    // method for getting all list of post
    @get:Query("SELECT * FROM post")
    val all: List<Post>

    // method for inserting all list of post
    @Insert
    fun insertAll(vararg users: Post)
}