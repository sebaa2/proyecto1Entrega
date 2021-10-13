package com.proyect.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.proyect.dev.reserva;
import com.proyect.dev.usuario;

import java.util.Arrays;
import java.util.Scanner;

import static com.proyect.dev.main2.*;
import static com.proyect.dev.main2.Pass;

public class test {
    static String pass = null;
    static String Reserva;

    @BeforeAll
    public static void setUp() {
        pass = Pass(); //hay que ver como implementar lo del github a la clase usuario o en el main
    }

    @Test
    public void check_leng() {
        int largo = pass.length();
        Assertions.assertTrue(largo >= 6 && largo <= 10);

    }

    @Test
    public void check_letras() {
        Assertions.assertTrue(pass.matches("^[a-zA-Z0-9]*$"));
    }

    @Test
    public void check_alpha() {
        boolean flag = false;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isAlphabetic(pass.charAt(i))) {
                flag = true;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void check_capital() {
        boolean flag = false;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                flag = true;
                break;
            }
        }

        Assertions.assertTrue(flag);

    }

    @Test
    public void check_number() {
        boolean flag = false;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                flag = true;
                break;
            }
        }

        Assertions.assertTrue(flag);

    }


//metodo de reserva de mesa
// ingreso de datos correctos(int)
// comprobar mesa libre

    public class ReservaTest {
        usuario u = new usuario("marcela", "hlalskc", "f.ksjks@gmail.cl");
        reserva r = new reserva(10, u);

        @BeforeAll
        public static void setUp() {
            reserva.setMesa(5);
        }

    }

    @Test
    public void check_mesa() {
        Scanner sc = new Scanner(System.in);
        int var = reserva.getMesa();
        Assertions.assertEquals(5, var);
    }

    @Test
    public void check_mesaDisponible() {
        boolean a = reserva.mesaDisponible();
        Assertions.assertTrue(a);
    }
}
