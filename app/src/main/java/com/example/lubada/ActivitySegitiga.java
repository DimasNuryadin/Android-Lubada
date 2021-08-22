package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySegitiga extends AppCompatActivity implements View.OnClickListener {
    EditText Alas, Tinggi;
    Button Hitung, Hapus;
    TextView Hasil;

    Double hasill = 0.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        Alas = findViewById(R.id.edAlas);
        Tinggi = findViewById(R.id.edTinggi);
        Hitung = findViewById(R.id.btnHitung);
        Hasil = findViewById(R.id.hasil);
        Hapus = findViewById(R.id.btnHapus);

        Hitung.setOnClickListener(this);
        Hapus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == Hitung) {
            if (Alas.length()==0 && Tinggi.length()==0) {
                Toast.makeText(this, "Alas dan Tinggi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (Alas.length()==0){
                Toast.makeText(this, "Alas Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (Tinggi.length()==0) {
                Toast.makeText(this, "Tinggi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double alas = Double.valueOf(Alas.getText().toString());
                Double tinggi = Double.valueOf(Tinggi.getText().toString());
                Double segitiga = alas*tinggi;
                hasill = segitiga * 0.5 ;
                Hasil.setText(String.valueOf(hasill));
            }
        }
        if (v == Hapus) {
            Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
            Hasil.setText(String.valueOf(0));
        }
    }
}