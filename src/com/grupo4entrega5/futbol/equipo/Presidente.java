package com.grupo4entrega5.futbol.equipo;

public class Presidente {
    private String dni;
    private String nombrePresidente;

    public Presidente(String dni, String nombrePresidente) {
        this.dni = dni;
        this.nombrePresidente = nombrePresidente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }
}