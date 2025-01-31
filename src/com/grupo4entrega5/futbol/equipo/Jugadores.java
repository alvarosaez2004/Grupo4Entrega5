package com.grupo4entrega5.futbol.equipo;

import java.sql.Date;

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

    public void setDorsal(int dorsal) {
        if (dorsal > 0) {
            this.dorsal = dorsal;
        } else {
            System.out.println("El dorsal debe ser positivo.");
        }

    }
}
