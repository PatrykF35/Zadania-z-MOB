package com.example.tablice4_4filipek;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout container = findViewById(R.id.container);
        Resources res = getResources();

        String[] nazwy = res.getStringArray(R.array.wojewodztwa);
        int[] daneNowe = res.getIntArray(R.array.mieszkancy_nowi);
        int[] daneStare = res.getIntArray(R.array.mieszkancy_stary);

        for (int i = 0; i < nazwy.length; i++) {
            int roznica = daneNowe[i] - daneStare[i];
            String slowoOsoba = res.getQuantityString(R.plurals.osoby, daneNowe[i]);
            String tekstHtml = (i + 1) + ". " + nazwy[i] + ": <b>" + daneNowe[i] + "</b> " + slowoOsoba + "<br>Zmiana: <i><u>" + (roznica > 0 ? "+" : "") + roznica + "</u></i>";

            TextView tv = new TextView(this);
            tv.setPadding(0, 10, 0, 10);
            tv.setTextSize(17);

            tv.setText(Html.fromHtml(tekstHtml, Html.FROM_HTML_MODE_COMPACT));


            if (roznica > 0) {
                tv.setTextColor(Color.parseColor("#2E7D32"));
            } else if (roznica < 0) {
                tv.setTextColor(Color.RED);
            } else {
                tv.setTextColor(Color.GRAY);
            }
            container.addView(tv);
        }
    }
}