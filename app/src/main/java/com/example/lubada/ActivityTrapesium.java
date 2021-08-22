package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTrapesium extends AppCompatActivity implements View.OnClickListener {
    EditText SisiA, SisiB, Tinggi;
    Button Hitung;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        SisiA = findViewById(R.id.edSisiA);
        SisiB = findViewById(R.id.edSisiB);
        Tinggi = findViewById(R.id.edTinggi);
        Hasil = findViewById(R.id.hasil);
        Hitung = findViewById(R.id.btnHitung);

        Hitung.setOnClickListener(this);
    }

    public void btnHapus(View view) {
        Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
        Hasil.setText(String.valueOf(0));
    }

    @Override
    public void onClick(View v) {
        if (v == Hitung) {
            if (SisiA.length()==0 || SisiB.length()==0 || Tinggi.length()==0) {
                Toast.makeText(this, "Sisi A, Sisi B, Tinggi Harus diisi", Toast.LENGTH_SHORT).show();
            }  else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double siA = Double.valueOf(SisiA.getText().toString());
                Double siB = Double.valueOf(SisiB.getText().toString());
                Double ting = Double.valueOf(Tinggi.getText().toString());
                Double siAB = siA + siB;
                hasill = siAB * 0.5 * ting;
                Hasil.setText(String.valueOf(hasill));
            }
        }
    }
}