package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toBiodata(View view) {
        Intent moveToBiodata = new Intent(MainActivity.this,Biodata.class);
        startActivity(moveToBiodata);
    }

    public void toArtikel(View view) {
        Intent moveToArtikel = new Intent(MainActivity.this,Artikel.class);
        startActivity(moveToArtikel);
    }

    public void toBeranda(View view) {
        Intent a = new Intent (MainActivity.this, Biodata.class);
        startActivity(a);
    }
}