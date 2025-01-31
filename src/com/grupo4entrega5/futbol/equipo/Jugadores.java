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
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
        this.Nacionalidad = Nacionalidad;
        this.Posicion = Posicion;
        this.Dorsal = Dorsal;
        this.Traspaso = Traspaso;

    }

    public void setDorsal(int Dorsal) {
        if (Dorsal > 0) {
            this.Dorsal = Dorsal;
        } else {
            System.out.println("El Dorsal debe ser positivo.");
        }

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        Nacimiento = nacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public Posiciones getPosicion() {
        return Posicion;
    }

    public void setPosicion(Posiciones posicion) {
        Posicion = posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public TraspasoJugadores getTraspaso() {
        return Traspaso;
    }

    public void setTraspaso(TraspasoJugadores traspaso) {
        Traspaso = traspaso;
    }

}
