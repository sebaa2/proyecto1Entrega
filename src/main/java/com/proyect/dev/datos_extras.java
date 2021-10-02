package com.proyect.dev;

public class datos_extras {
    String chef;
    String especial;
    int anuo_creacion;

    public datos_extras(String chef, String especial, int anuo_creacion) {
        this.chef = chef;
        this.especial = especial;
        this.anuo_creacion = anuo_creacion;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public int getAnuo_creacion() {
        return anuo_creacion;
    }

    public void setAnuo_creacion(int anuo_creacion) {
        this.anuo_creacion = anuo_creacion;
    }
}
