package firebase.app.moverseentreventanas;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ventana2;
    Button ventana3;
    Button ventana4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ventana2=(Button)findViewById(R.id.ventana2);
        ventana3=(Button)findViewById(R.id.ventana3);
        ventana4=(Button)findViewById(R.id.ventana4);

        ventana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ventana2.class);
                startActivity(i);
            }
        });

        ventana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ventana3.class);
                startActivity(i);
            }
        });

        ventana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, ventana4.class);
                startActivity(i);
            }
        });
    }
}