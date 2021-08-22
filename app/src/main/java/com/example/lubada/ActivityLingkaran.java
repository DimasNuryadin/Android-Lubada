package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLingkaran extends AppCompatActivity implements View.OnClickListener {
    EditText Jari;
    Button Hitung;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        Jari = findViewById(R.id.jari);
        Hitung = findViewById(R.id.btnHitung);
        Hasil = findViewById(R.id.hasil);

        Hitung.setOnClickListener(this);

    }

    public void btnHapus(View view) {
        Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
        Hasil.setText(String.valueOf(0));
    }

    @Override
    public void onClick(View v) {
        if (v == Hitung) {
            if (Jari.length()==0) {
                Toast.makeText(this, "Jari - Jari harus diisi", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double jarii = Double.valueOf(Jari.getText().toString());
                hasill = 3.14 * jarii * jarii;
                Hasil.setText(String.valueOf(hasill));
            }
        }
    }
}