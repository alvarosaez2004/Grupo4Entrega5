package com.grupo4entrega5.futbol.equipo;

import java.util.Date;
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;
import com.grupo4entrega5.futbol.Personas.Trabajador;

/**
 * La clase <code>Jugadores</code> representa a un jugador de fútbol en un
 * equipo, y hereda de la clase abstracta Trabajador.
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
     * clase Trabajador.
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
        super(nombre, fechaNacimiento, nacionalidad); // Llamada al constructor de la clase Trabajador
        this.posicion = posicion;
        this.traspaso = traspaso;
        this.equipo = equipo;
        this.setDorsal(dorsal);
        contadorJugadores++;
    }

    /**
     * Obtiene el número de jugadores creados.
     * 
     * @return el número de jugadores.
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Establece el dorsal del jugador. El dorsal debe ser mayor o igual a 0.
     * Si el dorsal es negativo, no se establece.
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

    // Métodos getter y setter para todos los atributos restantes...

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public TraspasoJugadores getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(TraspasoJugadores traspaso) {
        this.traspaso = traspaso;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    // Sobrescribir el método mostrarInfo heredado de Trabajador
    @Override
    public void mostrarInfo() {
        System.out.println("Jugador: " + getNombre() + ", Nacionalidad: " + getPaisOrigen()
                + ", Posición: " + posicion + ", Dorsal: " + dorsal + ", Equipo: " + equipo.getNombreEquipo());
    }

    /**
     * Devuelve una representación en forma de cadena del jugador.
     * 
     * @return una cadena con los detalles del jugador.
     */
    @Override
    public String toString() {
        return "Jugador [Nombre = " + getNombre() + ", Nacionalidad = " + getPaisOrigen() + ", Posición = "
                + posicion + ", Dorsal = " + dorsal + ", Traspaso = " + traspaso + ", Equipo = "
                + equipo.getNombreEquipo() + "]";
    }
}
