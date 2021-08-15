package com.example.lesson7android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.lesson7android1.Fragment1.FirstFragment;
import com.example.lesson7android1.Fragment2.SecondFragment;
import com.example.lesson7android1.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private BottomNavigationView bottomNavigationView;
    private TextView toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.mainContainer, new FirstFragment()).commit();
        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_nav:
                        binding.toolbarView.setTitle("Character");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new FirstFragment()).commit();
                        break;
                    case R.id.like_nav:
                        binding.toolbarView.setTitle("Location");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new SecondFragment()).commit();
                        break;
                }
                return true;
            }
        });


    }
}