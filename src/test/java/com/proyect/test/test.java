package com.proyect.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.proyect.dev.Usuario;

import java.util.Scanner;

import static com.proyect.dev.Usuario.password;

public class test {
    static String pass = null;
    static String Reserva;

    @BeforeAll
    public static void setUp() {
        pass = password(); //hay que ver como implementar lo del github a la clase usuario o en el main
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



}
