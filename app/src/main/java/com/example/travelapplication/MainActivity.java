package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAfrica, btnAsia, btnEurope, btnNorthAmerica, btnSouthAmerica, btnOceania, btnTalkAgent, btnPickCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAfrica = findViewById(R.id.btn_africa);
        btnAsia = findViewById(R.id.btn_asia);
        btnEurope = findViewById(R.id.btn_europe);
        btnNorthAmerica = findViewById(R.id.btn_north_america);
        btnSouthAmerica = findViewById(R.id.btn_south_america);
        btnOceania = findViewById(R.id.btn_oceania);
        btnTalkAgent = findViewById(R.id.btn_talk_agent);
        btnPickCity = findViewById(R.id.btn_pick_city); // New button

        btnAfrica.setOnClickListener(v -> openAfricaActivity());
        btnAsia.setOnClickListener(v -> openAsiaActivity());
        btnEurope.setOnClickListener(v -> openEuropeActivity());
        btnNorthAmerica.setOnClickListener(v -> openNorthAmericaActivity());
        btnSouthAmerica.setOnClickListener(v -> openSouthAmericaActivity());
        btnOceania.setOnClickListener(v -> openOceaniaActivity());
        btnTalkAgent.setOnClickListener(v -> openTravelAgentActivity());

        // Set onClickListener for Pick a City button
        btnPickCity.setOnClickListener(v -> openPickCityActivity());
    }

    private void openAfricaActivity() {
        Intent intent = new Intent(MainActivity.this, AfricaActivity.class);
        startActivity(intent);
    }

    private void openAsiaActivity() {
        Intent intent = new Intent(MainActivity.this, AsiaActivity.class);
        startActivity(intent);
    }

    private void openEuropeActivity() {
        Intent intent = new Intent(MainActivity.this, EuropeActivity.class);
        startActivity(intent);
    }

    private void openNorthAmericaActivity() {
        Intent intent = new Intent(MainActivity.this, NorthAmericaActivity.class);
        startActivity(intent);
    }

    private void openSouthAmericaActivity() {
        Intent intent = new Intent(MainActivity.this, SouthAmericaActivity.class);
        startActivity(intent);
    }

    private void openOceaniaActivity() {
        Intent intent = new Intent(MainActivity.this, OceaniaActivity.class);
        startActivity(intent);
    }

    private void openTravelAgentActivity() {
        Intent intent = new Intent(MainActivity.this, TravelAgentActivity.class);
        startActivity(intent);
    }

    // onClick method for "Pick a City" button
    private void openPickCityActivity() {
        Intent intent = new Intent(MainActivity.this, PickACity.class);
        startActivity(intent);
    }
}
