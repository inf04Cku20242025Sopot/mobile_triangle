package com.example.poletrojkata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView podstawa, wysokosc, pole, obwod;
    Button obliczPole, obliczObwod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        podstawa = findViewById(R.id.podstawa);
        wysokosc = findViewById(R.id.wysokosc);
        pole = findViewById(R.id.pole);
        obwod = findViewById(R.id.obwod);
        obliczPole = findViewById(R.id.obliczPole);


        obliczPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String podstawaStr = podstawa.getText().toString();
                String wysokoscStr = wysokosc.getText().toString();

                if (podstawa.length() > 0 && wysokoscStr.length() > 0) {
                    Double podstawaDbl = Double.parseDouble(podstawaStr);
                    Double wysokoscDbl = Double.parseDouble(wysokoscStr);

                    Double poleWynik = (podstawaDbl * wysokoscDbl) / 2;
                    pole.setText(String.format("%.2f", poleWynik));


                }


            }
        });

    }
}