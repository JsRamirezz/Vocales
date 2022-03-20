package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vocalO extends AppCompatActivity {

    ImageView imgO;
    ImageView imgOso;
    MediaPlayer letraO;
    MediaPlayer osoSonido;

    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_o);

        regresar= findViewById(R.id.btnRegresarO);

        imgO= (ImageView) findViewById(R.id.imgO);
        imgOso=(ImageView) findViewById(R.id.imgOso);

        letraO = (MediaPlayer) MediaPlayer.create(this, R.raw.letra_o);
        osoSonido=(MediaPlayer) MediaPlayer.create(this, R.raw.oso);

        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letraO.start();
            }
        });

        imgOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                osoSonido.start();
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