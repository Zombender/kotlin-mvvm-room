package com.example.room_mvvm.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    object PersonList: Route

    @Serializable
    object PersonForm: Route
}