package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_weather); // Set your layout here
            // Create Adapter
            WeatherPagerAdapter adapter = new WeatherPagerAdapter(getSupportFragmentManager());
            // Create and set ViewPager
            ViewPager viewPager = findViewById(R.id.view_pager);
            viewPager.setAdapter(adapter);
            // Create and set TabLayout
            TabLayout tabLayout = findViewById(R.id.tabLayout);
            tabLayout.setupWithViewPager(viewPager);
            Log.i("MyApp", "onCreate called"); // Log a message
        };

       @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume(){
        super.onResume();
    };
    @Override
    protected void onPause(){
        super.onPause();
    };

    @Override
    protected void onStop() {
        super.onStop();
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }}
