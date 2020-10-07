package com.example.insertarregistros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class GuardarProducto extends AppCompatActivity {
    Modelo_Categorias datos = new Modelo_Categorias();
    DateBase conexion = new DateBase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_producto);

        final Spinner categorias = findViewById(R.id.id_categoria);
        Button guardarproducto = findViewById(R.id.btn_guardar);
        List<String> lables = conexion.mostrarcategoriaspinner();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, lables);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorias.setAdapter(dataAdapter);

        guardarproducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), categorias.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}