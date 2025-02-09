package com.grupo4entrega5.futbol.equipo;

import com.grupo4entrega5.futbol.alineacion.Alineacion;

/**
 * La clase <code>Entrenador</code> representa a un entrenador de fútbol.
 * Contiene información relevante como el nombre del entrenador, la alineación
 * favorita del entrenador, y el equipo al que dirige.
 * 
 * <p>
 * El entrenador tiene acceso a la alineación preferida y al equipo al que
 * pertenece.
 * </p>
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Entrenador {

    /**
     * Nombre del entrenador.
     */
    private String Nombre;

    /**
     * Alineación favorita del entrenador.
     */
    private Alineacion Al_fav;

    /**
     * Equipo al que pertenece el entrenador.
     */
    private Equipo equipo;

    /**
     * Constructor de la clase <code>Entrenador</code>. Inicializa un nuevo
     * entrenador con los detalles proporcionados.
     * 
     * @param Nombre     Nombre del entrenador.
     * @param Alineacion Alineación favorita del entrenador.
     * @param equipo     El equipo al que pertenece el entrenador.
     */
    public Entrenador(String Nombre, Alineacion Alineacion, Equipo equipo) {
        this.Nombre = Nombre;
        this.Al_fav = Alineacion;
        this.equipo = equipo;
    }

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return el nombre del entrenador.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param Nombre El nuevo nombre del entrenador.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene la alineación favorita del entrenador.
     * 
     * @return la alineación favorita del entrenador.
     */
    public Alineacion getAl_fav() {
        return Al_fav;
    }

    /**
     * Establece la alineación favorita del entrenador.
     * 
     * @param Alineacion La nueva alineación favorita del entrenador.
     */
    public void setAl_fav(Alineacion Alineacion) {
        this.Al_fav = Alineacion;
    }

    /**
     * Obtiene el equipo al que pertenece el entrenador.
     * 
     * @return el equipo del entrenador.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo al que pertenece el entrenador.
     * 
     * @param equipo El nuevo equipo del entrenador.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Devuelve una representación en forma de cadena del entrenador.
     * 
     * @return una cadena con los detalles del entrenador.
     */
    @Override
    public String toString() {
        return "Entrenador [Nombre = " + Nombre + ", Al_fav = " + Al_fav + ", equipo = " + equipo.getNombreEquipo()
                + "]";
    }
}
