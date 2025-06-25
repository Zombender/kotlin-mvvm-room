package com.example.room_mvvm.data

import kotlinx.coroutines.flow.Flow

class OfflinePersonsRepository(private val personDAO: PersonDAO) : PersonsRepository {
    override fun getAllPersonsStream(): Flow<List<Person>> = personDAO.getAllPersons()

    override fun getPersonStream(id: Int): Flow<Person?> = personDAO.getPerson(id)

    override suspend fun insertPerson(person: Person) = personDAO.insert(person)

    override suspend fun deletePerson(person: Person) = personDAO.delete(person)

    override suspend fun updatePerson(person: Person) = personDAO.update(person)

}