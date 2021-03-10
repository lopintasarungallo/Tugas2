package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void toArtikel(View view) {
        Intent moveToArtikel = new Intent(Biodata.this, Artikel.class);
        startActivity(moveToArtikel);
    }

    public void toBeranda(View view) {
        Intent moveToBeranda = new Intent(Biodata.this, MainActivity.class);
        startActivity(moveToBeranda);
    }

}