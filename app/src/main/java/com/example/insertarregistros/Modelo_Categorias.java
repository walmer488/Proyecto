package com.example.insertarregistros;

import java.io.Serializable;

public class Modelo_Categorias  implements Serializable{
    int id_categoria;
    String nombre_categoria;
    int estado_categoria;

    public Modelo_Categorias(){

    }

    public Modelo_Categorias(int id_categoria, String nombre_categoria, int estado_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.estado_categoria = estado_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public int getEstado_categoria() {
        return estado_categoria;
    }

    public void setEstado_categoria(int estado_categoria) {
        this.estado_categoria = estado_categoria;
    }
}
