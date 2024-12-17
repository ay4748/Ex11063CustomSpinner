package com.example.ex11063_customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextView details;
    Country[] countries;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.countries);
        details = findViewById(R.id.details);

        countries = new Country[]{
                new Country(R.drawable.bulgeria2, "Bulgeria", "Sophia", 6430000),
                new Country(R.drawable.france, "France", "Paris", 68170000),
                new Country(R.drawable.germany, "Germany", "Berlin", 84480000),
                new Country(R.drawable.israel, "Israel", "Jerusalim", 9757000),
                new Country(R.drawable.spain, "Spain", "Real Madrid", 48370000),
                new Country(R.drawable.ukraine, "ukraine", "Kyiv", 37000000),
                new Country(R.drawable.usa, "USA", "Washington", 335000000)
        };

        spinner.setOnItemSelectedListener(this);

        CustomAdapter customAdapter = new CustomAdapter(this, countries);
        spinner.setAdapter(customAdapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        details.setText("Country details:\nCountry name: " + countries[position].getCountryname() + "\nCapital: " + countries[position].getCapital() + "\nPopulation size: " + countries[position].getSize());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}