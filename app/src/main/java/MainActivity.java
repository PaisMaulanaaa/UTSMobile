package com.example.pembukuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView cardMenabung, cardPemasukan, cardPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardMenabung = findViewById(R.id.cardMenabung);
        cardPemasukan = findViewById(R.id.cardPemasukan);
        cardPengeluaran = findViewById(R.id.cardPengeluaran);

        cardMenabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menabung clicked", Toast.LENGTH_SHORT).show();
                // Add your logic or start an activity for Menabung
            }
        });

        cardPemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pemasukan clicked", Toast.LENGTH_SHORT).show();
                // Add your logic or start an activity for Pemasukan
            }
        });

        cardPengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pengeluaran clicked", Toast.LENGTH_SHORT).show();
                // Add your logic or start an activity for Pengeluaran
            }
        });
    }
}
