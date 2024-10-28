package br.com.movieapp.framework.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.com.movieapp.framework.presentation.navigation.BottomNavigationBar
import br.com.movieapp.framework.presentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

    Scaffold(

        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        content = {

            NavigationGraph(navController= navController)
        }
    )


}