package com.tolgacobanoglu.stackoverflow_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.tolgacobanoglu.stackoverflow_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.bottomNav, navController)

        binding.floatingActionButton.setOnClickListener{
            navController.navigate(R.id.newPostFragment)
        }


        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->

            when (destination.id)
            {   //TODO R.id.noConnectionFragment will be added
                R.id.splashFragment, R.id.signInFragment, R.id.signUpFragment, R.id.forgotPasswordFragment ->
                {
                    binding.bottomNav.visibility = View.GONE
                    binding.floatingActionButton.visibility = View.GONE
                }
                else ->
                {
                    binding.bottomNav.visibility = View.VISIBLE
                    binding.floatingActionButton.visibility = View.VISIBLE
                }
            }
        }


    }
}