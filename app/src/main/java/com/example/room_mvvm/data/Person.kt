package com.example.room_mvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "persons")
data class Person (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val age: Int
)
