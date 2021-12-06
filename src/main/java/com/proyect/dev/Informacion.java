package com.proyect.dev;

public class Informacion {
    String chef;
    String especial;
    int anuo_creacion;

    public Informacion(String chef, String especial, int anuo_creacion) {
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

    public String getPlatillo_Especial() {
        return especial;
    }

    public void setPlatillo_Especial(String especial) {
        this.especial = especial;
    }

    public int getAnno_creacion() {
        return anuo_creacion;
    }

    public void setAnno_creacion(int anuo_creacion) {
        this.anuo_creacion = anuo_creacion;
    }

    @Override
    public String toString() {
        return "Informacion del restaurant: " + "chef = " + '\n'
                + ", especial = " + especial + '\n'
                + ", anuo_creacion = " + anuo_creacion + '}';
    }
}
