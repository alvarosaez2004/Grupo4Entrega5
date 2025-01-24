package com.grupo4entrega5.futbol.equipo;

import java.sql.Date;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;

public class Jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;
    public Posiciones posicion;
    public int dorsal;
    public TraspasoJugadores traspaso;

    public Jugadores(String nombre, Date nacimiento, String nacionalidad, TraspasoJugadores traspaso,
            Posiciones posicion, int dorsal) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.dorsal = dorsal;

        if (dorsal < 1 || dorsal > 99) {
            System.out.println("El dorsal no es válido");
            return;
        }
        this.traspaso = traspaso;

    }

}
