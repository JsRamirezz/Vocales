package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vocal_i extends AppCompatActivity {

    ImageView imgI;
    ImageView imgIsla;
    MediaPlayer letraI;
    MediaPlayer islaSonido;

    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_i);

        regresar= findViewById(R.id.btnRegresarI);

        imgI= (ImageView) findViewById(R.id.imgI);
        imgIsla=(ImageView) findViewById(R.id.imgIsla);

        letraI = (MediaPlayer) MediaPlayer.create(this, R.raw.letra_i);
        islaSonido= (MediaPlayer) MediaPlayer.create(this, R.raw.isla);

        imgI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letraI.start();
            }
        });

        imgIsla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islaSonido.start();
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