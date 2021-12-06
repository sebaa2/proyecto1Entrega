package com.proyect.dev;
//reservar mesa
//liberar mesa

import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Reserva {
    private static String[] mesas;
    private static Usuario usuario;
     int total_mesas;
    private static int mesa;

    public Reserva(int total_mesas, Usuario usuario) {
        this.total_mesas = total_mesas;
        this.mesas = new String[total_mesas];
        this.usuario = usuario;

    }

    public static int ingreseMesas() {
        System.out.println("ingrese mesa");
        Scanner leer = new Scanner(System.in);
        int mesa = leer.nextInt();
        return mesa;
    }

    public static boolean mesaDisponible() {
        if (mesas[mesa] == null) {
            System.out.println("Mesa disponible");
            return true;
        } else {
            System.out.println("Mesa no disponible");
            return false;
        }
    }

    public static void reservaMesa() throws IOException {
        if (mesaDisponible() == true) {
            usuario.getNom_usuario();
            System.out.println("Mesa reservada con exito a nombre de " + usuario.getNom_usuario());
            Logger logger = Logger.getLogger(main2.class.getName());
            FileHandler fileLog = new FileHandler("mylog.log");
            logger.addHandler(fileLog);
            SimpleFormatter formatter = new SimpleFormatter();
            fileLog.setFormatter(formatter);


            logger.info("Se abre el log");
            logger.info("mesa reservada");
            logger.log(Level.INFO, "funciono");
        } else {
            System.out.println("No se puede reservar mesa");
        }
    }

    public static void setMesa(int mesa) {
        Reserva.mesa = mesa;
    }

    public static void menuReserva() throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija opcion ");

        System.out.println("1. Ingrese numero de mesa\n"
                + "2. Reservar mesa\n");
        int opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                ingreseMesas();
                mesaDisponible();
                break;
            case 2:
                reservaMesa();
                break;

        }
    }


    public static int getMesa() {
        return mesa;
    }

    public static String[] getMesas() {
        return mesas;
    }
}