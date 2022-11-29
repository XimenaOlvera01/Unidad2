package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter= findViewById(R.id.button);
    }
    public void revision(View view){
        // Revisar que loging y password sean iguales
        Intent v1 = new Intent(MainActivity.this,Bienvenida.class);
        startActivity(v1);
    }
}