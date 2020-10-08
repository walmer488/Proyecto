package com.example.insertarregistros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class GuardarProducto extends AppCompatActivity {

    private static final String TAG = "GuardarProducto";

    Modelo_Categorias datosCategoria = new Modelo_Categorias();

    DateBase conexion = new DateBase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_producto);

        final Spinner categorias = findViewById(R.id.id_categoria);
        Button guardarproducto = findViewById(R.id.btn_guardar);
        List<String> lables = conexion.mostrarcategoriaspinner();

        final EditText etNombre = findViewById(R.id.pro_nombre);
        final EditText etDescripcion = findViewById(R.id.pro_descripcion);
        final EditText etCantidad = findViewById(R.id.pro_stock);
        final EditText etPrecio = findViewById(R.id.pro_precio);
        final EditText etEstado = findViewById(R.id.pro_estado);
        final Spinner spCategoria = findViewById(R.id.id_categoria);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, lables);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorias.setAdapter(dataAdapter);

        guardarproducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Modelo_Productos datos = new Modelo_Productos();

                try {
                    datos.setNombre_producto(etNombre.getText().toString());
                    datos.setDescripcion_producto(etDescripcion.getText().toString());
                    datos.setCantidad_producto(Integer.parseInt(etCantidad.getText().toString()));
                    datos.setPrecio(Double.parseDouble(etPrecio.getText().toString()));
                    datos.setEstado(Integer.parseInt(etEstado.getText().toString()));
                    datos.setId_categoria(conexion.getIdCategoria(spCategoria.getSelectedItem().toString()));

                    if (conexion.InsertProducto(datos)) {
                        Toast.makeText(GuardarProducto.this, "¡Producto insertado satisfactoriamente!", Toast.LENGTH_SHORT).show();
                        // Intent lu = new Intent(GuardarProducto.this, recycler_Categoria.class);
                        //startActivity(lu);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Error. Ya existe un producto con\n" +
                                " Nombre: " + etNombre.getText().toString(), Toast.LENGTH_LONG).show();
                    }

                   // Log.i(TAG, "From spinner: " + spCategoria.getSelectedItem().toString() );
                    //int idCategoria = conexion.getIdCategoria(spCategoria.getSelectedItem().toString());
                    //Log.i(TAG, "idCategoria From database: " + idCategoria );
                }catch (Exception e){
                    Log.e(TAG, "ERROR: " + e.getMessage());
                }


              //  Toast.makeText(getApplicationContext(), categorias.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}