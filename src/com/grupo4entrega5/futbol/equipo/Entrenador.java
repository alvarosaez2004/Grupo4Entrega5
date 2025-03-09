package com.grupo4entrega5.futbol.equipo;

import java.util.Date;
import com.grupo4entrega5.futbol.Personas.Trabajador; // Importación de la clase Trabajador
import com.grupo4entrega5.futbol.alineacion.Alineacion;

public class Entrenador extends Trabajador {
    private Alineacion al_fav;
    private Equipo equipo;

    public Entrenador(String nombre, Date fechaNacimiento, String paisOrigen, Alineacion al_fav, Equipo equipo) {
        super(nombre, fechaNacimiento, paisOrigen); // Llamada al constructor de la clase padre
        this.al_fav = al_fav;
        this.equipo = equipo;
    }

    public Alineacion getAl_fav() {
        return al_fav;
    }

    public void setAl_fav(Alineacion al_fav) {
        this.al_fav = al_fav;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Entrenador: " + nombre + ", Nacionalidad: " + paisOrigen + ", Alineación favorita: "
                + al_fav + ", Equipo: " + equipo.getNombreEquipo());
    }

    @Override
    public String toString() {
        return "Entrenador [Nombre = " + nombre + ", Alineación favorita = " + al_fav + ", Equipo = "
                + equipo.getNombreEquipo() + "]";
    }
}