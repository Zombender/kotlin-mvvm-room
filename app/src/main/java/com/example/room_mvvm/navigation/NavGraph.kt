package com.example.room_mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navController: NavHostController
) {
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = Route.PersonList.toRouteString()
    ) {
        composable(Route.PersonList.toRouteString()) {
            // PersonListScreen(navController)
        }
        composable(Route.PersonForm.toRouteString()) {
            // PersonFormScreen(navController)
        }
    }
}