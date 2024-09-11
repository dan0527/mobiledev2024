package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


    public class WeatherActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_weather); // Set your layout here
            // Create a new WeatherFragment
            vn.edu.usth.usthweather.WeatherFragment weatherFragment = new vn.edu.usth.usthweather.WeatherFragment();
            // Add the WeatherFragment
            getSupportFragmentManager().beginTransaction().add(R.id.main, weatherFragment).commit();
            // Create a new ForecastFragment to be placed in the activity
            ForecastFragment forecastFragment = new ForecastFragment();
            // Add the ForecastFragment to the 'container' FrameLayout
            getSupportFragmentManager().beginTransaction().add(R.id.main, forecastFragment).commit();
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
