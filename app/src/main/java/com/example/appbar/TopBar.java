package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TopBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_bar);

        Barra();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    private void Barra() {
        getSupportActionBar().hide();
    }

    public boolean OnCreateOptionsMenu(Menu menu){
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