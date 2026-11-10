package com.example.zadanie5_0filipek;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvOrientation = findViewById(R.id.tvOrientation);
        TextView tvRandomNumber = findViewById(R.id.tvRandomNumber);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            String tekst = getString(R.string.orientation_landscape);
            tvOrientation.setText(tekst);
        } else {
            String tekst = getString(R.string.orientation_portrait);
            tvOrientation.setText(tekst);
        }
        Random r = new Random();
        int numer = r.nextInt(9) + 1;
        tvRandomNumber.setText(String.valueOf(numer));
    }
}