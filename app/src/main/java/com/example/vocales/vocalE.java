package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vocalE extends AppCompatActivity {

    ImageView imgE;
    ImageView imgElefante;
    MediaPlayer letraE;
    MediaPlayer elefanteSonido;

    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_e);

        regresar= findViewById(R.id.btnRegresarE);

        imgE= (ImageView) findViewById(R.id.imgE);
        imgElefante= (ImageView) findViewById(R.id.imgElefante) ;

        letraE = (MediaPlayer) MediaPlayer.create(this, R.raw.letra_e);

        imgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letraE.start();
            }
        });

        elefanteSonido = (MediaPlayer) MediaPlayer.create(this, R.raw.elefante);

        imgElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elefanteSonido.start();
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