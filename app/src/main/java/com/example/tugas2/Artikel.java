package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
    }

    public void toBeranda(View view) {
        Intent moveToBeranda = new Intent(Artikel.this, MainActivity.class);
        startActivity(moveToBeranda);
    }

    public void toBiodata(View view) {
        Intent moveToBiodata = new Intent(Artikel.this, MainActivity.class);
        startActivity(moveToBiodata);
    }
}