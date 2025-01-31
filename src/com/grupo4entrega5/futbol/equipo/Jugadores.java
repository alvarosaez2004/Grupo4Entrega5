package com.grupo4entrega5.futbol.equipo;

import java.util.Date;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;

public class Jugadores {

    private String nombre;
    private Date nacimiento;
    private String nacionalidad;
    private Posiciones posicion;
    private int dorsal;
    private TraspasoJugadores traspaso;

    public Jugadores(String nombre, Date nacimiento, String nacionalidad, TraspasoJugadores traspaso,
            Posiciones posicion, int dorsal) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.traspaso = traspaso;

    }

    public void setdorsal(int dorsal) {
        if (dorsal > 0) {
            this.dorsal = dorsal;
        } else {
            System.out.println("El dorsal debe ser positivo.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public TraspasoJugadores getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(TraspasoJugadores traspaso) {
        this.traspaso = traspaso;
    }

}
