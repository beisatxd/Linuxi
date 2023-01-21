package com.example.lineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Lotus_Brimstone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotus_brimstone);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem selected) {
        switch (selected.getItemId()) {
            case android.R.id.home: {
                finish();
                return true;
            }
            case R.id.about_option: {
                Intent i = new Intent(getApplicationContext(), Info.class);
                startActivity(i);
                return true;
            }
        }
        return super.onOptionsItemSelected(selected);
    }
}