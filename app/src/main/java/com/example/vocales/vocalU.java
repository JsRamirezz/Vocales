package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vocalU extends AppCompatActivity {

    ImageView imgU;
    ImageView imgUva;
    MediaPlayer letraU;
    MediaPlayer uvaSonido;

    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_u);


        regresar= findViewById(R.id.btnRegresarU);

        imgU=(ImageView) findViewById(R.id.imgU);
        imgUva= (ImageView) findViewById(R.id.imgUva);

        letraU = (MediaPlayer) MediaPlayer.create(this, R.raw.letra_u);
        uvaSonido= (MediaPlayer) MediaPlayer.create(this, R.raw.uva);

        imgU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letraU.start();
        }

    });

        imgUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uvaSonido.start();
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
