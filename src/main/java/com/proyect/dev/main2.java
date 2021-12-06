package com.proyect.dev;

import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws IOException {
        Usuario u = new Usuario("marcela", "hlalskc", "f.ksjks@gmail.cl");

        Reserva reserva = new Reserva(10, u);

        Restaurant r = new Restaurant("Macdonal", "Delicias N°23");
        Informacion informacion = new Informacion("Camila lagos", "Papas Fritas", 2006);
        System.out.println("Bienvenido al sistema de reserva y informacion de restaurantes");
        // opciones: ver informacion
        //realizar reserva

        reserva.menuReserva();

    }


}

