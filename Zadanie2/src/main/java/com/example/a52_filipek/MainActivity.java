package com.example.a52_filipek;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView wyswietlaczLiczby = findViewById(R.id.tvRandomNumber);
        TextView prostokatPx = findViewById(R.id.rectPx);
        TextView prostokatDp = findViewById(R.id.rectDp);
        TextView prostokatSp = findViewById(R.id.rectSp);
        TextView prostokatPt = findViewById(R.id.rectPt);
        TextView prostokatMm = findViewById(R.id.rectMm);
        TextView prostokatIn = findViewById(R.id.rectIn);

        Random losowanie = new Random();
        int wylosowanaLiczba = losowanie.nextInt(51) + 10;
        wyswietlaczLiczby.setText(String.valueOf(wylosowanaLiczba));

        int czerwony = (wylosowanaLiczba * 4) % 256;
        int zielony = (wylosowanaLiczba * 7) % 256;
        int niebieski = (wylosowanaLiczba * 12) % 256;
        int wylosowanyKolor = Color.rgb(czerwony, zielony, niebieski);

        prostokatPx.setBackgroundColor(wylosowanyKolor);
        prostokatDp.setBackgroundColor(wylosowanyKolor);
        prostokatSp.setBackgroundColor(wylosowanyKolor);
        prostokatPt.setBackgroundColor(wylosowanyKolor);
        prostokatMm.setBackgroundColor(wylosowanyKolor);
        prostokatIn.setBackgroundColor(wylosowanyKolor);

        prostokatPx.setTextColor(Color.TRANSPARENT);
        prostokatDp.setTextColor(Color.TRANSPARENT);
        prostokatSp.setTextColor(Color.TRANSPARENT);
        prostokatPt.setTextColor(Color.TRANSPARENT);
        prostokatMm.setTextColor(Color.TRANSPARENT);
        prostokatIn.setTextColor(Color.TRANSPARENT);

        String ksztaltBloku = "████";
        prostokatPx.setText(ksztaltBloku);
        prostokatDp.setText(ksztaltBloku);
        prostokatSp.setText(ksztaltBloku);
        prostokatPt.setText(ksztaltBloku);
        prostokatMm.setText(ksztaltBloku);
        prostokatIn.setText(ksztaltBloku);

        prostokatPx.setTextSize(TypedValue.COMPLEX_UNIT_PX, wylosowanaLiczba);
        prostokatDp.setTextSize(TypedValue.COMPLEX_UNIT_DIP, wylosowanaLiczba);
        prostokatSp.setTextSize(TypedValue.COMPLEX_UNIT_SP, wylosowanaLiczba);
        prostokatPt.setTextSize(TypedValue.COMPLEX_UNIT_PT, wylosowanaLiczba);
        prostokatMm.setTextSize(TypedValue.COMPLEX_UNIT_MM, wylosowanaLiczba);
        prostokatIn.setTextSize(TypedValue.COMPLEX_UNIT_IN, wylosowanaLiczba);
    }
}