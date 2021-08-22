package com.example.lubada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLayang2 extends AppCompatActivity implements View.OnClickListener {
    EditText Diagonal1, Diagonal2;
    Button Hitung;
    TextView Hasil;

    Double hasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang2);
        Diagonal1 = findViewById(R.id.diagonal1);
        Diagonal2 = findViewById(R.id.diagonal2);
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
            if (Diagonal1.length()==0 && Diagonal2.length()==0) {
                Toast.makeText(this, "Diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
            } else if (Diagonal1.length()==0){
                Toast.makeText(this, "Diagonal 1 Harus diisi", Toast.LENGTH_SHORT) .show();
            } else if (Diagonal2.length()==0) {
                Toast.makeText(this, "Diagonal 2 Harus diisi", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Berhasil dihitung", Toast.LENGTH_SHORT).show();
                Double dia1 = Double.valueOf(Diagonal1.getText().toString());
                Double dia2 = Double.valueOf(Diagonal2.getText().toString());
                Double diag = dia1 * dia2;
                hasill = diag * 0.5;
                Hasil.setText(String.valueOf(hasill));
            }
        }
    }
}