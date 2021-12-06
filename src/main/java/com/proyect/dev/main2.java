package com.proyect.dev;

import java.util.Scanner;
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

       // reserva.menuReserva();

       menu(r,informacion,reserva);



    }



    public static void menu (Restaurant r, Informacion informacion, Reserva reserva) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija opcion ");

        System.out.println("1.Ver Restaurante\n"
                + "2.Informacion Restaurante \n"
                + "3. Realizar Reserva");
        int opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                r.toString();

                break;
            case 2:
                informacion.toString();
                break;
            case 3:
                reserva.menuReserva();
                break;
        }
    }



}

