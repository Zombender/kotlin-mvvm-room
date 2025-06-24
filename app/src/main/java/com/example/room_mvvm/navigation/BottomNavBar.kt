package com.example.room_mvvm.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(val route: Route, val icon: ImageVector, val label: String)

@Composable
fun BottomNavBar(navController: androidx.navigation.NavHostController) {
    val items = listOf(
        BottomNavItem(Route.PersonList, Icons.Default.Person, "Personas"),
        BottomNavItem(Route.PersonForm, Icons.Default.Create, "Agregar Persona")
    )

    androidx.compose.material3.NavigationBar {
        items.forEach { item ->
            val selected = navController.currentBackStackEntry?.destination?.route == item.route.toRouteString()
            NavigationBarItem(
                selected = selected,
                onClick = {
                    if (!selected) {
                        navController.navigate(item.route.toRouteString()) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true

                            restoreState = true

                        }
                    }
                },
                icon = { androidx.compose.material3.Icon(item.icon, contentDescription = item.label) },
                label = { androidx.compose.material3.Text(item.label) }
            )
        }
    }
}