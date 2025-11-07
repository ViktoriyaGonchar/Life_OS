package com.life_os.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.life_os.ui.screens.home.HomeScreen
import com.life_os.ui.screens.locations.LocationsMenuScreen
import com.life_os.ui.screens.settings.SettingsScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object LocationsMenu : Screen("locations_menu")
    object Settings : Screen("settings")
    object TermsOfService : Screen("terms_of_service")
    object PrivacyPolicy : Screen("privacy_policy")
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToLocations = { navController.navigate(Screen.LocationsMenu.route) },
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) }
            )
        }
        composable(Screen.LocationsMenu.route) {
            LocationsMenuScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Screen.Settings.route) {
            SettingsScreen(
                onNavigateBack = { navController.popBackStack() },
                onNavigateToTerms = { navController.navigate(Screen.TermsOfService.route) },
                onNavigateToPrivacy = { navController.navigate(Screen.PrivacyPolicy.route) }
            )
        }
        composable(Screen.TermsOfService.route) {
            com.life_os.ui.screens.terms.TermsOfServiceScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Screen.PrivacyPolicy.route) {
            com.life_os.ui.screens.privacy.PrivacyPolicyScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
