package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.share) {
            Toast.makeText(getApplicationContext(), "Seleccionaste la opción de Compartir",
                    Toast.LENGTH_SHORT).show();
        } else if (id == R.id.aboutus) {
            Toast.makeText(getApplicationContext(), "Seleccionaste la opción de Acerca de",
                    Toast.LENGTH_SHORT).show();
        } else if (id == R.id.exit) {
            Toast.makeText(getApplicationContext(), "Seleccionaste la opción de Salir",
                    Toast.LENGTH_SHORT).show();
        }else if (id == R.id.search) {
            Toast.makeText(getApplicationContext(), "Seleccionaste la opción de Buscar",
                    Toast.LENGTH_SHORT).show();
        }else if (id == R.id.ajustes) {
            Toast.makeText(getApplicationContext(), "Seleccionaste la opción de Ajustes",
                    Toast.LENGTH_SHORT).show();
        }

        return true;
    }


}