package com.safety.emergency.notifier.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


enum class Route() {
    Signup(),
    Login(),
    Dashboard(),
    Issue(),
    Commit();

    companion object {
        fun fromRoute(route: String?): Route =
            when (route?.substringBefore("/")) {
                Signup.name -> Signup
                Login.name -> Login
                Dashboard.name -> Dashboard
                Issue.name -> Issue
                Commit.name -> Commit
                null -> Dashboard
                else -> throw IllegalArgumentException("Route $route is not recognized.")
            }
    }
}