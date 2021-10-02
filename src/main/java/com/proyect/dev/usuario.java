package com.proyect.dev;

public class usuario {
    String nom_usuario;
    String clave;
    String correo;

    public usuario(String nom_usuario, String clave, String correo) {
        this.nom_usuario = nom_usuario;
        this.clave = clave;
        this.correo = correo;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
