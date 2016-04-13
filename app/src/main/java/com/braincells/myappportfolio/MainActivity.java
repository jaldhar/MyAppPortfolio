package com.braincells.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onButtonClick(View view) {
        // I didn't put the toast texts into resources because they are only temporary.
        switch (view.getId()) {
            case R.id.btnMovies:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Popular Movies\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnStock:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Stock Hawk\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnBigger:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Build it Bigger\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnMaterial:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Make Your App Material\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnUbiquitous:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Go Ubiquitous\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this,
                        "This button will launch my \"Capstone\" app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.fab:
                Toast.makeText(MainActivity.this,
                        "This button will send an email to me",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}