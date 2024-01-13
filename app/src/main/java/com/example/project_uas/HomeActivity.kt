package com.example.project_uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.setupWithNavController


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val navigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navController = findNavController(R.id.fragmentContainerView)
        navigationView.setupWithNavController(navController)

    }
}