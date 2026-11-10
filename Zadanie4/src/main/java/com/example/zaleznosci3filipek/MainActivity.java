package com.example.zaleznosci3filipek;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView[] textViews = new TextView[7];
        textViews[0] = findViewById(R.id.tv1);
        textViews[1] = findViewById(R.id.tv2);
        textViews[2] = findViewById(R.id.tv3);
        textViews[3] = findViewById(R.id.tv4);
        textViews[4] = findViewById(R.id.tv5);
        textViews[5] = findViewById(R.id.tv6);
        textViews[6] = findViewById(R.id.tv7);

        Random random = new Random();
        Resources res = getResources();

        ArrayList<Integer> kolory = new ArrayList<>();

        kolory.add(R.color.moj1);
        kolory.add(R.color.moj2);
        kolory.add(R.color.moj3);
        kolory.add(R.color.moj4);
        kolory.add(R.color.moj5);
        kolory.add(R.color.moj6);
        kolory.add(R.color.moj7);

        for (int i = 0; i < 7; i++) {
            int liczba = random.nextInt(99) + 1;
            String tekst = res.getQuantityString(R.plurals.iloscsztuk, liczba, liczba);
            textViews[i].setText(tekst);
            textViews[i].setTextColor(ContextCompat.getColor(this, kolory.get(i)));
        }
    }
}