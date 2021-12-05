package com.example.crypto;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewsActivity extends AppCompatActivity {

    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        wv1=(WebView)findViewById(R.id.webView);

        wv1.loadUrl("https://www.coindesk.com/");


        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                   case R.id.action_latest:
                        Toast.makeText(NewsActivity.this, "Daily Go!", Toast.LENGTH_SHORT).show();
                        Intent dailyIntent =  new Intent( NewsActivity.this, CryptoActivity.class);
                        startActivity(dailyIntent);
                        break;
                    case R.id.action_fav:
                        Toast.makeText(NewsActivity.this, "Favorites Go!", Toast.LENGTH_SHORT).show();
                        Intent favIntent =  new Intent( NewsActivity.this, FavoritesActivity.class);
                        startActivity(favIntent);
                        break;
                    case R.id.action_news:
                        Toast.makeText(NewsActivity.this, "News Go!", Toast.LENGTH_SHORT).show();
                        Intent newsIntent =  new Intent( NewsActivity.this, NewsActivity.class);
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
                Intent Intent = new Intent(NewsActivity.this, MainActivity.class);
                startActivity(Intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}

