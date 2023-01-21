package com.example.lineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Ascent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascent);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void iconHandler(View v) {
        switch (v.getId()) {
            case R.id.ascent_brimstone: {
                Intent i = new Intent(getApplicationContext(), Ascent_Brimstone.class);
                startActivity(i);
                break;
            }
            case R.id.ascent_fade: {
                Intent i = new Intent(getApplicationContext(), Ascent_Fade.class);
                startActivity(i);
                break;
            }
            case R.id.ascent_killjoy: {
                Intent i = new Intent(getApplicationContext(), Ascent_Killjoy.class);
                startActivity(i);
                break;
            }
            case R.id.ascent_sova: {
                Intent i = new Intent(getApplicationContext(), Ascent_Sova.class);
                startActivity(i);
                break;
            }
            case R.id.ascent_viper: {
                Intent i = new Intent(getApplicationContext(), Ascent_Viper.class);
                startActivity(i);
                break;
            }
            case R.id.ascent_yoru: {
                Intent i = new Intent(getApplicationContext(), Ascent_Yoru.class);
                startActivity(i);
                break;
            }
        }
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