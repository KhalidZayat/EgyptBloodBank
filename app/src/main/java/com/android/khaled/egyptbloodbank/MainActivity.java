package com.android.khaled.egyptbloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,AdapterView.OnItemSelectedListener {

    String Blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /////////////////////////////////////////////////////////////////

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList <String>();
        categories.add("Cairo");
        categories.add("Giza");
        categories.add("Assuit");
        categories.add("Sohag");
        categories.add("Qena");
        categories.add("Luxer");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /////////////////////////////////////////////////////////////////

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_search)
        {


        }
        else if (id == R.id.nav_register)
        {
            Intent intent = new Intent(getBaseContext(), Registeration.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_tips)
        {

        }
        else if (id == R.id.nav_blood)
        {

        }
        else if (id == R.id.nav_share)
        {

        }
        else if (id == R.id.nav_send)
        {

        }
        else if (id == R.id.nav_about)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @FromXML
    public void onClick(View v)
    {
        TextView Main_A_Plus = (TextView)findViewById(R.id.Main_A_Plus);
        TextView Main_A_minus = (TextView)findViewById(R.id.Main_A_minus);
        TextView Main_B_Plus = (TextView)findViewById(R.id.Main_B_Plus);
        TextView Main_B_Minus = (TextView)findViewById(R.id.Main_B_Minus);
        TextView Main_O_Plus = (TextView)findViewById(R.id.Main_O_Plus);
        TextView Main_O_Minus = (TextView)findViewById(R.id.Main_O_Minus);
        TextView Main_AB_Plus = (TextView)findViewById(R.id.Main_AB_Plus);
        TextView Main_AB_Minus = (TextView)findViewById(R.id.Main_AB_Minus);
        TextView Main_Any = (TextView)findViewById(R.id.Main_Any);

        Main_A_Plus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_A_Plus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_A_minus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_A_minus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_B_Plus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_B_Plus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_B_Minus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_B_Minus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_O_Plus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_O_Plus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_O_Minus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_O_Minus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_AB_Plus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_AB_Plus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_AB_Minus.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_AB_Minus.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        Main_Any.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        Main_Any.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        TextView textView = (TextView)v;
        textView.setTextColor(getResources().getColor(R.color.White));
        textView.setBackgroundDrawable(getResources().getDrawable(R.drawable.red_border));

        Blood = textView.getText().toString();
        // Showing selected blood
        Toast.makeText(getBaseContext(), "Selected: " + Blood, Toast.LENGTH_SHORT).show();


    }
}


