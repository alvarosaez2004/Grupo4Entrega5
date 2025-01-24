package com.grupo4entrega5.futbol.equipo;

import com.grupo4entrega5.futbol.alineacion.Alineacion;

public class Entrenador {
    public String nombre;
    public Alineacion al_fav;

    public Entrenador(String nombre, Alineacion alineacion) {
        this.nombre = nombre;
        this.al_fav = alineacion;

    }

}
