package com.androidclub24;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_widget_demo);

        Spinner spinnerCountry  = findViewById(R.id.spinner_country);

        String country[] = {"USA","INDIA","UK","CANADA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,country);
        spinnerCountry.setAdapter(adapter);

        
    //android -> data -> adapter->

    }
}