package com.example.room_mvvm.data

import kotlinx.coroutines.flow.Flow

interface PersonsRepository {
    fun getAllPersonsStream(): Flow<List<Person>>

    fun getPersonStream(id: Int): Flow<Person?>

    suspend fun insertPerson(person: Person)

    suspend fun deletePerson(person: Person)

    suspend fun updatePerson(person: Person)
}