package com.example.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class itemform extends AppCompatActivity {
    Spinner combo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemform);

        combo = findViewById(R.id.spinnerbarang);

    }

    public void main(View view) { startActivity(new Intent(itemform.this, MainActivity.class));
    }
}