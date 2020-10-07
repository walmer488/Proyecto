package com.example.insertarregistros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GuardarCategoria extends AppCompatActivity {

    private Button btn_categorias;
    private EditText id_categoria, nombre_categoria, estado_categoria;

    private static final String TAG = "MainActivity";
    boolean id_cat = false;
    boolean nom_categoria = false;
    boolean estado_cate = false;
    int resultadolnsert = 0;

    Modelo_Categorias datos = new Modelo_Categorias();
    DateBase conexion = new DateBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_categoria);

        btn_categorias = findViewById(R.id.btn_categorias);
        nombre_categoria = findViewById(R.id.nombre_categoria);
        estado_categoria = findViewById(R.id.estado_categoria);
    }

    public void guardar(View view) {
        if (nombre_categoria.getText().toString().length()==0){
            nombre_categoria.setError("campo obligatorio");
            nom_categoria = false;
        }else {
            nom_categoria = true;
        }

        if (estado_categoria.getText().toString().length()==0){
            estado_categoria.setError("campo obligatorio");
            estado_cate = false;
        }else {
            estado_cate = true;
        }

        if ( nom_categoria && estado_cate) {
            datos.setNombre_categoria (nombre_categoria.getText().toString());
            datos.setEstado_categoria(Integer.parseInt(estado_categoria.getText().toString()));

            if (conexion.InsertarCategorias(datos)) {
                Toast.makeText(GuardarCategoria.this, "¡Categoria registrada satisfactoriamente!", Toast.LENGTH_SHORT).show();
                Intent lu = new Intent(GuardarCategoria.this, recycler_Categoria.class);
                startActivity(lu);
            }
            else{
                Toast.makeText(getApplicationContext(), "Error. Ya existe un registro\n" +
                        " Nombre: " + nombre_categoria.getText().toString(), Toast.LENGTH_LONG).show();
            }
        }
    }

}