package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button botonA;
    private Button botonE;
    private Button botonI;
    private Button botonO;
    private Button botonU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonA= findViewById(R.id.btnA);
        botonE= findViewById(R.id.btnE);
        botonI= findViewById(R.id.btnI);
        botonO= findViewById(R.id.btnO);
        botonU= findViewById(R.id.btnU);


        botonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paso = new Intent(getApplicationContext(), vocalA.class);
                startActivity(paso);
            }
        });


        botonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paso = new Intent(getApplicationContext(), vocalE.class);
                startActivity(paso);
            }
        });


        botonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paso = new Intent(getApplicationContext(), vocal_i.class);
                startActivity(paso);
            }
        });

        botonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paso = new Intent(getApplicationContext(), vocalO.class);
                startActivity(paso);
            }
        });

        botonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paso = new Intent(getApplicationContext(), vocalU.class);
                startActivity(paso);
            }
        });





    }
}