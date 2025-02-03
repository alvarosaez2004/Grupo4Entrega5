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

    public Jugadores(String Nombre, Date Nacimiento, String Nacionalidad, TraspasoJugadores Traspaso,
            Posiciones Posicion, int Dorsal) {
        this.nombre = Nombre;
        this.nacimiento = Nacimiento;
        this.nacionalidad = Nacionalidad;
        this.posicion = Posicion;
        this.dorsal = Dorsal;
        this.traspaso = Traspaso;

    }

    public void setDorsal(int Dorsal) {
        if (Dorsal > 0) {
            this.dorsal = Dorsal;
        } else {
            System.out.println("El Dorsal debe ser positivo.");
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
