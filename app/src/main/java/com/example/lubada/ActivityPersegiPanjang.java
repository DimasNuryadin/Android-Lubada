package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPersegiPanjang extends AppCompatActivity implements View.OnClickListener {
    EditText Panjang, Lebar;
    Button Hitung;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        Panjang = findViewById(R.id.edPanjang);
        Lebar = findViewById(R.id.edLebar);
        Hitung = findViewById(R.id.btnHitung);
        Hasil = findViewById(R.id.hasil);

        Hitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == Hitung) {
            if (Panjang.length()==0 && Lebar.length()==0){
                Toast.makeText(this, "Panjang dan Lebar Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (Panjang.length()==0) {
                Toast.makeText(this, "Panjang Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            } else if (Lebar.length()==0) {
                Toast.makeText(this, "Lebar Tidak Boleh kosong", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double panjang = Double.valueOf(Panjang.getText().toString());
                Double lebar = Double.valueOf(Lebar.getText().toString());
                hasill = panjang * lebar;
                Hasil.setText(String.valueOf(hasill));
            }
        }
    }

    public void btnHapus(View view) {
        Toast.makeText(this, "Berhasil dihapus", Toast.LENGTH_SHORT).show();
        Hasil.setText(String.valueOf(0));
    }
}