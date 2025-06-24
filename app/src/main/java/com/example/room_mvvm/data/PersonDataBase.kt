package com.example.room_mvvm.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Person::class], version = 1, exportSchema = false)
abstract class PersonDataBase : RoomDatabase() {

    abstract fun PersonDAO(): PersonDAO

    companion object {
        @Volatile
        private var Instance: PersonDataBase? = null

        fun getDatabase(context: Context): PersonDataBase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, PersonDataBase::class.java, "person_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}