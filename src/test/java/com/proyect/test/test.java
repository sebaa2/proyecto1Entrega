package com.proyect.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


public class test {
    static String pass2check = null;

    @BeforeAll
    public static void setUp() {
       // pass2check = Gen_Pass();
    }


    @Test
    public void check_length() {
        int largo = pass2check.length();
        Assertions.assertTrue(largo >= 6 && largo <= 10);
    }


    @Test
    public void check_alphanum() {
        Assertions.assertTrue(pass2check.matches("^[a-zA-Z0-9]*$"));
    }
}
