package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vocalA extends AppCompatActivity {

    ImageView imgA;
    ImageView imgAbeja;
    MediaPlayer letraA;
    MediaPlayer abejaSonido;

    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal);

        regresar= findViewById(R.id.btnRegresar);

        imgA= (ImageView) findViewById(R.id.imgA);
        imgAbeja= (ImageView) findViewById(R.id.imgAbeja);

        letraA = (MediaPlayer) MediaPlayer.create(this, R.raw.letra_a);

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letraA.start();
            }
        });

        abejaSonido = (MediaPlayer) MediaPlayer.create(this, R.raw.abeja);

        imgAbeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abejaSonido.start();
            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(regresar);
            }
        });


    }
}