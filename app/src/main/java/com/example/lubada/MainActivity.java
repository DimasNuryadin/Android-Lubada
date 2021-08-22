package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    // Deklarasi Variabel
    ImageButton btnPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityPersegi.class);
                startActivity(i);
            }
        });
    }

    public void btnPersegiPanjang(View view) {
        startActivity(new Intent(this, ActivityPersegiPanjang.class));
    }

    public void btnSegitiga(View view) {
        startActivity(new Intent(this, ActivitySegitiga.class));
    }

    public void btnJajarGenjang(View view) {
        startActivity(new Intent(this, ActivityJajarGenjang.class));
    }

    public void btnBelahKetupat(View view) {
        startActivity(new Intent(this, ActivityBelahKetupat.class));
    }

    public void btnLayang2(View view) {
        startActivity(new Intent(this, ActivityLayang2.class));
    }

    public void btnTrapesium(View view) {
        startActivity(new Intent(this, ActivityTrapesium.class));
    }

    public void btnLingkaran(View view) {
        startActivity(new Intent(this, ActivityLingkaran.class));
    }
}