package com.example.room_mvvm.navigation

fun Route.toRouteString(): String = when (this) {
    Route.PersonList -> "person_list"
    Route.PersonForm -> "person_form"
}