package com.proyect.test;

import com.proyect.dev.Reserva;
import com.proyect.dev.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ReservarTest {
    Usuario u = new Usuario("marcela", "hlalskc", "f.ksjks@gmail.cl");
    Reserva r = new Reserva(10, u);

    @BeforeAll
    public static void setUp() {
        Reserva.setMesa(5);
    }


    @Test
    public void check_mesa() {
        Scanner sc = new Scanner(System.in);
        int var = Reserva.getMesa();
        Assertions.assertEquals(5, var);
    }

    @Test
    public void check_mesaDisponible() {
        boolean a = Reserva.mesaDisponible();
        Assertions.assertTrue(a);
    }
}





