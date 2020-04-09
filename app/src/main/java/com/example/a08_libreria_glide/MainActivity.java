package com.example.a08_libreria_glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    ImageView logotipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logotipo = (ImageView) findViewById(R.id.imageViewLogotipo);

        //Centra la imagen, si no cabe en la pantalla la corta, hay que aplicarla abajo
        //RequestOptions cropOptions = new RequestOptions().centerCrop();

        //Otra opción es la siguiente, en este caso no corta la imagen, sino que se ajusta al tamaño de la pantalla
        RequestOptions cropOptions = new RequestOptions().fitCenter();

        Glide.with(this)
                .load("http://miguelcamposrivera.com/logo_mecaround.png")
                .apply(cropOptions)
                .into(logotipo);
    }
}
