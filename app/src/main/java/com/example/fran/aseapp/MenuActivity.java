package com.example.fran.aseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goToLocalMap(View view) {
        // create new Intent
        Intent newLocalMap = new Intent(this, MapsActivity.class);
        // adjust zoom / go to location
        // go to map
        startActivity(newLocalMap);
    }
}
