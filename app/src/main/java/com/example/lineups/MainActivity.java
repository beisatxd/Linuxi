package com.example.lineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iconHandler(View v) {
        switch (v.getId()) {
            case R.id.Ascent_image: {
                Intent i = new Intent(getApplicationContext(), Ascent.class);
                startActivity(i);
                break;
            }
            case R.id.Bind_image: {
                Intent i = new Intent(getApplicationContext(), Bind.class);
                startActivity(i);
                break;
            }
            case R.id.Breeze_image: {
                Intent i = new Intent(getApplicationContext(), Breeze.class);
                startActivity(i);
                break;
            }
            case R.id.Fracture_image: {
                Intent i = new Intent(getApplicationContext(), Fracture.class);
                startActivity(i);
                break;
            }
            case R.id.Haven_image: {
                Intent i = new Intent(getApplicationContext(), Haven.class);
                startActivity(i);
                break;
            }
            case R.id.Icebox_image: {
                Intent i = new Intent(getApplicationContext(), Icebox.class);
                startActivity(i);
                break;
            }
            case R.id.Pearl_image: {
                Intent i = new Intent(getApplicationContext(), Pearl.class);
                startActivity(i);
                break;
            }
            case R.id.Split_image: {
                Intent i = new Intent(getApplicationContext(), Split.class);
                startActivity(i);
                break;
            }
            case R.id.Lotus_image: {
                Intent i = new Intent(getApplicationContext(), Lotus.class);
                startActivity(i);
                break;
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem selected) {
        switch (selected.getItemId()) {
            case R.id.about_option: {
                Intent i = new Intent(getApplicationContext(), Info.class);
                startActivity(i);
                return true;
            }
        }
        return super.onOptionsItemSelected(selected);
    }
}
