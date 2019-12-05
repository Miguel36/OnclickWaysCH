package com.example.eventonclickways;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button_anonymous_class);
        btn2 = findViewById(R.id.button_use_implement);
        btn2.setOnClickListener(this); // Se establece el evento onclick de la interfaz implementada

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Desde la Anonima", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Desde el OnClick de la interfaz implementada", Toast.LENGTH_SHORT).show();
    }

    public void eventOnClick(View view) {
        Toast.makeText(getApplicationContext(), "Desde el metodo OnClick que se llama desde el XML", Toast.LENGTH_SHORT).show();
    }
}
