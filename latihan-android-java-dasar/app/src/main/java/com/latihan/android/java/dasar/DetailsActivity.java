package com.latihan.android.java.dasar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView textViewDetails = findViewById(R.id.textViewDetails);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String education = extras.getString("education");
            textViewDetails.setText("Name : " + name + "\nEducation: " + education);
        }

    }
}
