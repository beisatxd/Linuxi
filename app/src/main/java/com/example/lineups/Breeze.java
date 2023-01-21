package com.example.lineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Breeze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeze);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void iconHandler(View v) {
        switch (v.getId()) {
            case R.id.breeze_brimstone: {
                Intent i = new Intent(getApplicationContext(), Breeze_Brimstone.class);
                startActivity(i);
                break;
            }
            case R.id.breeze_fade: {
                Intent i = new Intent(getApplicationContext(), Breeze_Fade.class);
                startActivity(i);
                break;
            }
            case R.id.breeze_killjoy: {
                Intent i = new Intent(getApplicationContext(), Breeze_Killjoy.class);
                startActivity(i);
                break;
            }
            case R.id.breeze_sova: {
                Intent i = new Intent(getApplicationContext(), Breeze_Sova.class);
                startActivity(i);
                break;
            }
            case R.id.breeze_viper: {
                Intent i = new Intent(getApplicationContext(), Breeze_Viper.class);
                startActivity(i);
                break;
            }
            case R.id.breeze_yoru: {
                Intent i = new Intent(getApplicationContext(), Breeze_Yoru.class);
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
            case R.id.about_option: {
                Intent i = new Intent(getApplicationContext(), Info.class);
                startActivity(i);
                return true;
            }
            case android.R.id.home: {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(selected);
    }
}