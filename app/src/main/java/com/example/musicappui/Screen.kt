package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {
    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int) :
        Screen(dRoute, dRoute) {
        object Account : DrawerScreen("Account", "account", R.drawable.ic_account)
        object Subscription :
            DrawerScreen("Subscription", "subscription", R.drawable.ic_subscription)

        object AddAccount : DrawerScreen("Add Account", "add_account", R.drawable.ic_add_account)
    }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)