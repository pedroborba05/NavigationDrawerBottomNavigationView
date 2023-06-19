package com.example.navigationelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationelements.databinding.ActivityBottonNavigationViewBinding

class BottonNavigationViewActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityBottonNavigationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBottonNavigationViewBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(_binding.fragmentContainerView2.id) as NavHostFragment
        val navController = navHostFragment.navController

        _binding.bottomNavigationView.setupWithNavController(navController)
    }
}