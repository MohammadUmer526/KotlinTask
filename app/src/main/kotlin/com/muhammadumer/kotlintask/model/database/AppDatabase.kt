package com.muhammadumer.kotlintask.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.muhammadumer.kotlintask.model.Post
import com.muhammadumer.kotlintask.model.PostDao

//DB configuration
@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}