package com.proyect.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class usuario {
    private static String nom_usuario;
    private static String clave;
    private String correo;

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

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        usuario.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
