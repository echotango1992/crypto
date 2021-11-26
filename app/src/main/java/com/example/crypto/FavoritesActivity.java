package com.example.crypto;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.ProgressBar;import androidx.recyclerview.widget.RecyclerView;


public class FavoritesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);



        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_latest:
                        Toast.makeText(FavoritesActivity.this, "Daily Go!", Toast.LENGTH_SHORT).show();
                        Intent dailyIntent = new Intent(FavoritesActivity.this, CryptoActivity.class);
                        startActivity(dailyIntent);
                        break;
                    case R.id.action_fav:
                        Toast.makeText(FavoritesActivity.this, "Favorites Go!", Toast.LENGTH_SHORT).show();
                        Intent favIntent = new Intent(FavoritesActivity.this, FavoritesActivity.class);
                        startActivity(favIntent);
                        break;
                    case R.id.action_news:
                        Toast.makeText(FavoritesActivity.this, "News Go!", Toast.LENGTH_SHORT).show();
                        Intent newsIntent = new Intent(FavoritesActivity.this, NewsActivity.class);
                        startActivity(newsIntent);
                        break;
                }
                return true;
            }

        });
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent Intent = new Intent(FavoritesActivity.this, SignInActivity.class);
                startActivity(Intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
