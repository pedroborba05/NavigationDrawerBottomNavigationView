package com.example.navigationelements

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigationelements.databinding.ActivityMainBinding

class ToolbarExampleActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment = (supportFragmentManager.findFragmentById(_binding.fragmentContainerView.id)) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(navController.graph)
        _binding.toolbar.setupWithNavController(navController, appBarConfiguration)

    }
}
