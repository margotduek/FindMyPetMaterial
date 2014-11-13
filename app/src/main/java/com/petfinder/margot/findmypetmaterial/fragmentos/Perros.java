package com.petfinder.margot.findmypetmaterial.fragmentos;

/**
 * Created by Margot on 12/11/2014.
 */
public class Perros {
    public static final String  CHICO= "chico";
    public static final String  MEDIANO= "mediano";
    public static final String  GRANDE= "grande";

    private String nombre;
    private boolean sexo;
    private String foto;
    private String raza;
    private String caracteristicas;
    private double zonaX;
    private double zonaY;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getZonaX() {
        return zonaX;
    }

    public void setZonaX(double zonaX) {
        this.zonaX = zonaX;
    }

    public double getZonaY() {
        return zonaY;
    }

    public void setZonaY(double zonaY) {
        this.zonaY = zonaY;
    }

}
