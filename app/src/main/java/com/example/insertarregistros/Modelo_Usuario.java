package com.example.insertarregistros;

import java.io.Serializable;

public class Modelo_Usuario implements Serializable {
    int id_usuario;
    String nombre_usuario;
    String apellido_usuario;
    String correo_usuario;
    String usuario_usu;
    String clave_usuario;
    String tipo_usuario;
    int estado_usuario;
    String pregunta_usuario;
    String respuesta_usuario;

    public Modelo_Usuario() {
    }

    public Modelo_Usuario(int id_usuario, String nombre_usuario, String apellido_usuario, String correo_usuario, String usuario_usu, String clave_usuario, String tipo_usuario, int estado_usuario, String pregunta_usuario, String respuesta_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.usuario_usu = usuario_usu;
        this.clave_usuario = clave_usuario;
        this.tipo_usuario = tipo_usuario;
        this.estado_usuario = estado_usuario;
        this.pregunta_usuario = pregunta_usuario;
        this.respuesta_usuario = respuesta_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getUsuario_usu() {
        return usuario_usu;
    }

    public void setUsuario_usu(String usuario_usu) {
        this.usuario_usu = usuario_usu;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(int estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public String getPregunta_usuario() {
        return pregunta_usuario;
    }

    public void setPregunta_usuario(String pregunta_usuario) {
        this.pregunta_usuario = pregunta_usuario;
    }

    public String getRespuesta_usuario() {
        return respuesta_usuario;
    }

    public void setRespuesta_usuario(String respuesta_usuario) {
        this.respuesta_usuario = respuesta_usuario;
    }
}
