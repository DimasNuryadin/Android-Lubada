package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPersegi extends AppCompatActivity implements View.OnClickListener {
    // Deklarasi
    EditText Sisi;
    Button BtnHitung;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        Sisi = findViewById(R.id.edSisi);
        BtnHitung = findViewById(R.id.btnHitung);
        Hasil = findViewById(R.id.hasil);

        BtnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == BtnHitung){
            if (Sisi.length()==0) {
                Toast.makeText(this, "Sisi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double count = Double.valueOf(Sisi.getText().toString());
                hasill = count * count;
                Hasil.setText(String.valueOf(hasill));
            }
        }
    }

    public void btnHapus(View view) {
        Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
        Hasil.setText(String.valueOf(0));
    }
}