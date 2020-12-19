package com.udemy.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private Button    botao_voltar;
    private ImageView img_cara_coroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        botao_voltar   = findViewById( R.id.id_botao_img_voltar );
        img_cara_coroa = findViewById( R.id.id_image_moeda_resultado );

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        int valor = new Random().nextInt( 2 );
        if ( valor == 0 ) // Cara
           img_cara_coroa.setImageResource( R.drawable.moeda_cara );
        else if ( valor == 1 ) // coroa
            img_cara_coroa.setImageResource( R.drawable.moeda_coroa );
    }
}