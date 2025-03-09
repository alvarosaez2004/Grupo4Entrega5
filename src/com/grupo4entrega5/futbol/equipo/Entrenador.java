package com.grupo4entrega5.futbol.equipo;

import java.util.Date;
import com.grupo4entrega5.futbol.Personas.Trabajador;
import com.grupo4entrega5.futbol.alineacion.Alineacion;

/**
 * Representa a un entrenador de fútbol, que es un tipo de trabajador del equipo.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Entrenador extends Trabajador {
    /** Alineación favorita del entrenador. */
    private Alineacion al_fav;
    
    /** Equipo al que pertenece el entrenador. */
    private Equipo equipo;

    /**
     * Constructor de la clase Entrenador.
     * 
     * @param nombre Nombre del entrenador.
     * @param fechaNacimiento Fecha de nacimiento del entrenador.
     * @param paisOrigen País de origen del entrenador.
     * @param al_fav Alineación favorita del entrenador.
     * @param equipo Equipo al que pertenece el entrenador.
     */
    public Entrenador(String nombre, Date fechaNacimiento, String paisOrigen, Alineacion al_fav, Equipo equipo) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.al_fav = al_fav;
        this.equipo = equipo;
    }

    /**
     * Obtiene la alineación favorita del entrenador.
     * 
     * @return Alineación favorita.
     */
    public Alineacion getAl_fav() {
        return al_fav;
    }

    /**
     * Establece la alineación favorita del entrenador.
     * 
     * @param al_fav Nueva alineación favorita.
     */
    public void setAl_fav(Alineacion al_fav) {
        this.al_fav = al_fav;
    }

    /**
     * Obtiene el equipo del entrenador.
     * 
     * @return Equipo del entrenador.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo del entrenador.
     * 
     * @param equipo Nuevo equipo.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Muestra la información del entrenador.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Entrenador: " + nombre + ", Nacionalidad: " + paisOrigen + 
                ", Alineación favorita: " + al_fav + ", Equipo: " + equipo.getNombreEquipo());
    }

    /**
     * Devuelve una representación en cadena del entrenador.
     * 
     * @return Cadena con la información del entrenador.
     */
    @Override
    public String toString() {
        return "Entrenador [Nombre = " + nombre + ", Alineación favorita = " + al_fav + 
                ", Equipo = " + equipo.getNombreEquipo() + "]";
    }
}
