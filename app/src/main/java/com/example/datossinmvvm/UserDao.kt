package com.example.datossinmvvm

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    suspend fun getAll(): List<User>

    @Query("SELECT * FROM User WHERE uid = :uid")
    suspend fun getUser(uid: Int): User

    @Insert
    suspend fun insert(user: User)

    @Delete
    suspend fun delete(user: User)
}