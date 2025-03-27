package com.example.travelapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TravelAgentActivity extends AppCompatActivity {

    private Button btnMeet;
    private TextView tvMeetLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_travel_agent);

        // Set up padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        btnMeet = findViewById(R.id.btn_meet);
        tvMeetLink = findViewById(R.id.tv_meet_link);

        // Set onClickListener for the button
        btnMeet.setOnClickListener(v -> showMeetLink());
    }

    private void showMeetLink() {
        // The Google Meet link
        String meetLink = "https://meet.google.com/uwu-zsek-gbv";

        // Make the TextView visible and set the link
        tvMeetLink.setVisibility(View.VISIBLE);
        tvMeetLink.setText(meetLink);
    }
}
