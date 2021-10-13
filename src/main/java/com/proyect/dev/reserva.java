package com.proyect.dev;
//reservar mesa
//liberar mesa

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reserva {
    private static String[] mesas;
    private static usuario usuario;
    private int total_mesas;
    private static int mesa;

    public reserva(int total_mesas, usuario usuario) {
        this.total_mesas = total_mesas;
        this.mesas = new String[total_mesas];
        this.usuario = usuario;

    }
    public static int ingreseMesas(){
        System.out.println("ingrese mesa");
        Scanner leer = new Scanner(System.in);
        int mesa = leer.nextInt();
        return mesa;
    }
    public static boolean mesaDisponible(){
        if (mesas[mesa]== null){
            System.out.println("Mesa disponible");
            return true;
        }else{
            System.out.println("Mesa no disponible");
            return false;
        }
    }

    public static void reservaMesa(){
        if (mesaDisponible() == true){
            usuario.getNom_usuario();
            System.out.println("Mesa reservada con exito a nombre de " + usuario.getNom_usuario());
        }else{
            System.out.println("No se puede reservar mesa");
        }
    }

    public static void setMesa(int mesa){
        reserva.mesa = mesa;
    }

    public static int getMesa(){
        return mesa;
    }

    public static String[]getMesas(){
        return mesas;
    }
}
