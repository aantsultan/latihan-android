package com.latihan.android.java.dasar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextEduction = findViewById(R.id.editTextEducation);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String education = editTextEduction.getText().toString();

            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("education", education);
            startActivity(intent);
        });
    }
}
