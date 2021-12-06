package com.proyect.dev;

public class Usuario {
    String nom_usuario;
    private static String clave;
     String correo;

    public Usuario(String nom_usuario, String clave, String correo) {
        this.nom_usuario = nom_usuario;
        this.clave = clave;
        this.correo = correo;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public static String getClave() {
        password();
        return clave;
    }

    public static String password() {
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = may.toLowerCase();
        String nums = "0123456789";
        String alphanums = may + min + nums;
        int i;

        int randomLength = 6 + (int) (Math.random() * 4);
        StringBuilder pass = new StringBuilder(randomLength);

        pass.append(may.charAt((int) (Math.random() * may.length())));
        pass.append(nums.charAt((int) (Math.random() * nums.length())));

        for (i = 2; i < randomLength; i++) {
            pass.append(alphanums.charAt((int) (Math.random() * alphanums.length())));
        }

        System.out.println(">>>" + pass.toString());
        return pass.toString();

    }

    public static void setClave(String clave) {
        Usuario.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
