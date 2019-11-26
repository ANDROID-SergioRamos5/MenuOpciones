package com.example.menuopciones;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String texto = "";

        switch (item.getItemId())
        {
            case  R.id.opcMenu1:
                texto = "1";
                break;
            case R.id.opcMenu2:
                texto = "2";
                break;
            case R.id.opcMenu3:
                texto = "3";
                break;
            case R.id.opcMenu4:
                texto = "4";
                break;
            case R.id.opcSubMenu1:
                texto = "4, el submenu 1";
                break;
            case R.id.opcSubMenu2:
                texto = "4, el submenu 2";
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        Toast.makeText(getApplicationContext(), "Ha pulsado el menu " + texto, Toast.LENGTH_LONG).show();

        return true;
    }
}
