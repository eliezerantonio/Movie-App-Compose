package br.com.movieapp.core.presentation.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.movieapp.ui.theme.black
import br.com.movieapp.ui.theme.yellow


@Composable
fun BottomNavigationBar(navController: NavController) {

    val items =
        listOf(BottomNavItem.MovieSearch, BottomNavItem.MoviePopular, BottomNavItem.MovieFavorite)


    BottomNavigation(contentColor = yellow, backgroundColor = black) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { destination ->

            BottomNavigationItem(selected = currentRoute == destination.route,
                onClick = {
                    navController.navigate(destination.route) {
                        //coloca nova tela no topo na pilha da navegacao  e remove outras
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = destination.icon, contentDescription = null) },
                label = { Text(destination.title) })
        }
    }

}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar(navController = rememberNavController())
}