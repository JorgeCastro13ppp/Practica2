package com.example.practica2bien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nombre,email,telefono;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos las variables con los controles
        nombre=findViewById(R.id.textNombre);
        email=findViewById(R.id.textEmail);
        telefono= findViewById(R.id.textTelefono);
        result= findViewById(R.id.viewRespuesta);
    }

    //Método de acción del botón mostrar
    public void Mostrar(View control){
        result.setText("Nombre:"+nombre.getText()+"\nEmail:"+email.getText()+"\nTeléfono:"+telefono.getText());
    }
}