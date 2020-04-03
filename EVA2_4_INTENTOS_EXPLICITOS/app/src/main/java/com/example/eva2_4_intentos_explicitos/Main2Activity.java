package com.example.eva2_4_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    //Intent inRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //inRegreso = new Intent(this, MainActivity.class);
    }
    public void onClick(View v){
        finish();
        //startActivity(inRegreso);
    }
}
//hacer de tarea el inento de la pagina web y de los contactos
//EVA2_5_CONTACTOS
//EVA2_6_WEB_SEARCH