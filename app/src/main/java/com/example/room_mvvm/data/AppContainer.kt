package com.example.room_mvvm.data

import android.content.Context

interface AppContainer {
    val personsRepository: PersonsRepository
}

class AppDataContainer(private val context: Context): AppContainer {
    override val personsRepository: PersonsRepository by lazy {
        OfflinePersonsRepository(PersonDataBase.getDatabase(context).PersonDAO())
    }
}