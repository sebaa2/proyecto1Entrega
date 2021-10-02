package com.proyect.dev;

public class restaurant {
    String Nombre;
    String Direccion;
    int puntuacion;

    public restaurant(String nombre, String direccion, int puntuacion) {
        Nombre = nombre;
        Direccion = direccion;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
