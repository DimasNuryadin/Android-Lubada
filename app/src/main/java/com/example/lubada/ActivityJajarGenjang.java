package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityJajarGenjang extends AppCompatActivity implements View.OnClickListener {
    EditText SisiAlas, Tinggi;
    Button Hitung, Reset;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        SisiAlas = findViewById(R.id.edAlas);
        Tinggi = findViewById(R.id.edTinggi);
        Hitung = findViewById(R.id.btnHitung);
        Hasil = findViewById(R.id.hasil);
        Reset = findViewById(R.id.btnReset);

        Hitung.setOnClickListener(this);
        Reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == Hitung) {
            if (SisiAlas.length()==0 && Tinggi.length()==0) {
                Toast.makeText(this, "Sisi Alas dan Tinggi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (SisiAlas.length()==0){
                Toast.makeText(this, "Sisi Alas Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (Tinggi.length()==0) {
                Toast.makeText(this, "Tinggi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else {
                Double alas = Double.valueOf(SisiAlas.getText().toString());
                Double tinggi = Double.valueOf(Tinggi.getText().toString());

                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                hasill = alas * tinggi;
                Hasil.setText(String.valueOf(hasill));
            }
        }

        if (v == Reset) {
            Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
            Hasil.setText(String.valueOf(0));
        }
    }
}