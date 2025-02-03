package com.grupo4entrega5.futbol.equipo;

public class Presidente {
    private String dni;
    private String nombrePresidente;
    private Equipo equipo;

    
    public Presidente(String dni, String nombrePresidente, Equipo equipo) {
        this.dni = dni;
        this.nombrePresidente = nombrePresidente;
        this.equipo = equipo;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
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