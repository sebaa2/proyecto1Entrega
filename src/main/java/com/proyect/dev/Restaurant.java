package com.proyect.dev;

import java.util.ArrayList;
import java.util.Optional;


public class Restaurant {
    private String Nombre;
    private String Direccion;

    private ArrayList<Integer> puntuacionPromedio;
    private long puntuacion;


    public Restaurant(String nombre, String direccion) {
        this.Nombre = nombre;
        this.Direccion = direccion;
    }

    public void mostrarInfo(Informacion info) {
        System.out.println(info.toString());
    }

    public void ingresarCalificacion(int caificacion) {
        puntuacionPromedio.add(caificacion);
    }

    public void puntuacionPromedio() {
        int suma = 0;
        for (int i = 0; i < puntuacionPromedio.size(); i++)
            suma += puntuacionPromedio.get(i);
        long contador = puntuacionPromedio.stream().count();

        puntuacion = suma / contador;

    }

    @Override
    public String toString() {
        return "Restaurant" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
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


}

