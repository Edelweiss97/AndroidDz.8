package com.example.androiddz8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.androiddz8.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        initNavController();
    }

    private void initNavController() {
        NavController navController = Navigation.findNavController(this,R.id.nav_host);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }

    private void initView() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
    }
}