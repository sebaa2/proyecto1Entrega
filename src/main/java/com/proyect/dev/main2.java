package com.proyect.dev;

public class main2 {
    public static String Pass() {

        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = may.toLowerCase();
        String nums = "0123456789";
        String alphanums = may + min + nums;
        int i;

        int randomLength = 6 + (int) (Math.random() * 4);
        StringBuilder pass = new StringBuilder(randomLength);

        pass.append(may.charAt((int)(Math.random() * may.length())));
        pass.append(nums.charAt((int)(Math.random() * nums.length())));

        for (i = 2; i < randomLength; i++) {
            pass.append(alphanums.charAt((int)(Math.random() * alphanums.length())));
        }

        System.out.println(">>>" + pass.toString());
        return pass.toString();
    }

    public static String Reserva(){
        usuario u = new usuario("marcela", "hlalskc", "f.ksjks@gmail.cl");
        reserva r = new reserva(10,u);
        reserva.ingreseMesas();
        reserva.mesaDisponible();
        reserva.reservaMesa();

        return Reserva();
    }

}
