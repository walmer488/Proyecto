package com.example.insertarregistros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class GuardarUsuario extends AppCompatActivity {

    Button btn_ingresar;
    EditText nombre_usu, apellido_usu, correo_usu, usuario_usu, contraseña_usu,  tipo_usu, estado_usu, pregunta_usu, respuesta_usu;

    private static final String TAG = "MainActivity";
    boolean id_usuario = false;
    boolean nombre = false;
    boolean apellido = false;
    boolean correo = false;
    boolean usuario = false;
    boolean clave = false;
    boolean tipo = false;
    boolean estado = false;
    boolean pregunta = false;
    boolean respuesta = false;
    int resultadolnsert = 0;

    Modelo_Usuario datos = new Modelo_Usuario();
    DateBase conexion = new DateBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_usuario);

        btn_ingresar = findViewById(R.id.btn_registrar);
        nombre_usu = findViewById(R.id.et_nombre_usu);
        apellido_usu = findViewById(R.id.et_apellido_usu);
        correo_usu = findViewById(R.id.et_correo_usu);
        usuario_usu = findViewById(R.id.et_usuario_usu);
        contraseña_usu = findViewById(R.id.et_clave_usu);
        tipo_usu = findViewById(R.id.et_tipo_usu);
        estado_usu = findViewById(R.id.et_estado_usu);
        pregunta_usu = findViewById(R.id.et_pregunta_usu);
        respuesta_usu = findViewById(R.id.et_respuesta_usu);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre_usu.getText().toString().length() == 0) {
                    nombre_usu.setError("Campo obligatorio");
                    nombre = false;
                }else{
                    nombre = true;
                }

                if (apellido_usu.getText().toString().length() == 0) {
                    apellido_usu.setError("Campo obligatorio");
                    apellido = false;
                }else{
                    apellido = true;
                }

                if(correo_usu.getText().toString().length() == 0){
                    correo_usu.setError("Campo obligatorio");
                    correo = false;
                }else{
                    correo = true;
                }

                if(usuario_usu.getText().toString().length() == 0){
                    usuario_usu.setError("Campo obligatorio");
                    usuario = false;
                }else{
                    usuario = true;
                }

                if(contraseña_usu.getText().toString().length() == 0){
                    contraseña_usu.setError("Campo obligatorio");
                    clave = false;
                }else{
                    clave = true;
                }

                if(tipo_usu.getText().toString().length() == 0){
                    tipo_usu.setError("Campo obligatorio");
                    tipo = false;
                }else{
                    tipo = true;
                }

                if(estado_usu.getText().toString().length() == 0){
                    estado_usu.setError("Campo obligatorio");
                    estado = false;
                }else{
                    estado = true;
                }

                if(pregunta_usu.getText().toString().length() == 0){
                    pregunta_usu.setError("Campo obligatorio");
                    pregunta = false;
                }else{
                    pregunta = true;
                }

                if(respuesta_usu.getText().toString().length() == 0){
                    respuesta_usu.setError("Campo obligatorio");
                    respuesta = false;
                }else{
                    respuesta = true;
                }

                if ( nombre && apellido && correo && usuario && clave && tipo && estado && pregunta && respuesta){
                    datos.setNombre_usuario (nombre_usu.getText().toString());
                    datos.setApellido_usuario(apellido_usu.getText().toString());
                    datos.setCorreo_usuario(correo_usu.getText().toString());
                    datos.setUsuario_usu(usuario_usu.getText().toString());
                    datos.setClave_usuario(contraseña_usu.getText().toString());
                    datos.setTipo_usuario(tipo_usu.getText().toString());
                    datos.setEstado_usuario (Integer.parseInt(estado_usu.getText().toString()));
                    datos.setPregunta_usuario(pregunta_usu.getText().toString());
                    datos.setRespuesta_usuario(respuesta_usu.getText().toString());

                    if (conexion.InserTradicional(datos)) {
                        Toast.makeText(GuardarUsuario.this, "Usuario registrado satisfactoriamente!", Toast.LENGTH_SHORT).show();
                        Intent lu = new Intent(GuardarUsuario.this, recycler_Usuario.class);
                        startActivity(lu);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Error. Ya existe un registro\n" +
                                " Nombre: " + nombre_usu.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });



    }
}