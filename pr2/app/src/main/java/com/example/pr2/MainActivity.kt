package com.example.pr2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this, navController)


//        replaceFragment(FragmentA())
//
//        val buttonFragmentA: Button = findViewById(R.id.buttonFragmentA)
//        val buttonFragmentB: Button = findViewById(R.id.buttonFragmentB)
//        val buttonFragmentC: Button = findViewById(R.id.buttonFragmentC)
//
//
//        buttonFragmentA.setOnClickListener {
//            replaceFragment(FragmentA())
//        }
//
//        buttonFragmentB.setOnClickListener {
//            replaceFragment(FragmentB())
//        }
//
//        buttonFragmentC.setOnClickListener {
//            replaceFragment(FragmentC())
//        }
//    }
//
//    private fun replaceFragment(fragment: Fragment) {
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
//        fragmentTransaction.addToBackStack(null)
//        fragmentTransaction.commit()
//    }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}