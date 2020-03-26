package com.dev_app.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

        Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init the spinner
        spinner = findViewById(R.id.spinner);

        //value to be shown in the spinner with the use of Array
        final String [] countries = {"Canada","Nigeria","United States","Russia"};

        //array adapter used to bind values in the spinner
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(arrayAdapter);



    }
}
