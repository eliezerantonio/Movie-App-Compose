package br.com.movieapp.core.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.movieapp.core.presentation.navigation.BottomNavigationBar
import br.com.movieapp.core.presentation.navigation.NavigationGraph

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




@Preview
@Composable
fun MainScreenPreview(){

    MainScreen( navController = rememberNavController() )
}

