package com.grupo4entrega5.futbol.equipo;

import java.util.Date;
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;
import com.grupo4entrega5.futbol.Personas.Trabajador;

/**
 * La clase <code>Jugadores</code> representa a un jugador de fútbol en un equipo.
 * Hereda de la clase abstracta {@link Trabajador}.
 */
public class Jugadores extends Trabajador {

    /**
     * Posición en el campo del jugador.
     */
    private Posiciones posicion;

    /**
     * Dorsal del jugador.
     */
    private int dorsal;

    /**
     * Información sobre el traspaso del jugador.
     */
    private TraspasoJugadores traspaso;

    /**
     * El equipo al que pertenece el jugador.
     */
    private Equipo equipo;

    /**
     * Contador de la cantidad de jugadores creados.
     */
    private static int contadorJugadores = 0;

    /**
     * Constructor de la clase <code>Jugadores</code>. Inicializa un nuevo jugador
     * con los detalles proporcionados, además de los atributos heredados de la
     * clase {@link Trabajador}.
     * 
     * @param nombre          Nombre del jugador.
     * @param fechaNacimiento Fecha de nacimiento del jugador.
     * @param nacionalidad    Nacionalidad del jugador.
     * @param traspaso        Información sobre el traspaso del jugador.
     * @param posicion        Posición en el campo del jugador.
     * @param dorsal          Dorsal del jugador.
     * @param equipo          El equipo al que pertenece el jugador.
     */
    public Jugadores(String nombre, Date fechaNacimiento, String nacionalidad,
            TraspasoJugadores traspaso, Posiciones posicion, int dorsal, Equipo equipo) {
        super(nombre, fechaNacimiento, nacionalidad);
        this.posicion = posicion;
        this.traspaso = traspaso;
        this.equipo = equipo;
        this.setDorsal(dorsal);
        contadorJugadores++;
    }

    /**
     * Obtiene el número total de jugadores creados.
     * 
     * @return Número de jugadores creados.
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Establece el dorsal del jugador. El dorsal debe ser un número positivo.
     * 
     * @param dorsal El dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        if (dorsal >= 0) {
            this.dorsal = dorsal;
        } else {
            System.out.println("El dorsal debe ser positivo.");
        }
    }

    /**
     * Obtiene la posición del jugador en el campo.
     * 
     * @return La posición del jugador.
     */
    public Posiciones getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del jugador en el campo.
     * 
     * @param posicion La nueva posición del jugador.
     */
    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene la información del traspaso del jugador.
     * 
     * @return Datos del traspaso del jugador.
     */
    public TraspasoJugadores getTraspaso() {
        return traspaso;
    }

    /**
     * Establece la información de traspaso del jugador.
     * 
     * @param traspaso Nueva información de traspaso.
     */
    public void setTraspaso(TraspasoJugadores traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * Obtiene el equipo del jugador.
     * 
     * @return El equipo al que pertenece el jugador.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo del jugador.
     * 
     * @param equipo El nuevo equipo del jugador.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Muestra la información detallada del jugador.
     * Sobrescribe el método {@link Trabajador#mostrarInfo()}.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Jugador: " + getNombre() + ", Nacionalidad: " + getPaisOrigen()
                + ", Posición: " + posicion + ", Dorsal: " + dorsal + ", Equipo: " + equipo.getNombreEquipo());
    }

    /**
     * Devuelve una representación en forma de cadena del jugador.
     * 
     * @return Una cadena con los detalles del jugador.
     */
    @Override
    public String toString() {
        return "Jugador [Nombre = " + getNombre() + ", Nacionalidad = " + getPaisOrigen() + ", Posición = "
                + posicion + ", Dorsal = " + dorsal + ", Traspaso = " + traspaso + ", Equipo = "
                + equipo.getNombreEquipo() + "]";
    }
}
