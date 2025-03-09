package com.grupo4entrega5.futbol.Fichajes;

import com.grupo4entrega5.futbol.equipo.Equipo;
import com.grupo4entrega5.futbol.equipo.Jugadores;

/**
 * La clase <code>TraspasoManager</code> gestiona los traspasos de jugadores
 * entre equipos, incluyendo la aprobación del entrenador y el presidente.
 */
public class TraspasoManager {

    /**
     * Contador de instancias de <code>TraspasoManager</code> creadas.
     */
    private static int contadorTraspasoManager = 0;

    /**
     * Constructor de la clase <code>TraspasoManager</code>.
     * Incrementa el contador de instancias creadas.
     */
    public TraspasoManager() {
        contadorTraspasoManager++;
    }

    /**
     * Obtiene el número de instancias creadas de <code>TraspasoManager</code>.
     * 
     * @return Número de instancias creadas.
     */
    public static int getcontadorTraspasoManager() {
        return contadorTraspasoManager;
    }

    /**
     * Inicia una solicitud de traspaso para un jugador.
     * 
     * @param jugador Jugador para el cual se solicita el traspaso.
     */
    public static void Traspaso(Jugadores jugador) {
        if (jugador.getTraspaso() == TraspasoJugadores.sinSolicitar) {
            jugador.setTraspaso(TraspasoJugadores.solicitado);
            System.out.println("Solicitud de traspaso enviada para " + jugador.getNombre());
        } else {
            System.out.println("El jugador ya tiene una solicitud de traspaso en curso.");
        }
    }

    /**
     * El entrenador toma una decisión sobre el traspaso de un jugador.
     * 
     * @param jugador Jugador en proceso de traspaso.
     * @param equipo  Equipo actual del jugador.
     * @param aceptar <code>true</code> si el entrenador aprueba el traspaso, <code>false</code> si lo rechaza.
     */
    public static void decisionEntrenador(Jugadores jugador, Equipo equipo, boolean aceptar) {
        if (jugador.getEquipo() != equipo) {
            System.out.println("El jugador no pertenece a este equipo.");
            return;
        }

        if (jugador.getTraspaso() != TraspasoJugadores.solicitado) {
            System.out.println("El traspaso no está solicitado.");
            return;
        }

        if (aceptar) {
            jugador.setTraspaso(TraspasoJugadores.aprobadoPorEntrenador);
            System.out.println("El entrenador ha aprobado el traspaso de " + jugador.getNombre());
        } else {
            jugador.setTraspaso(TraspasoJugadores.rechazadoPorEntrenador);
            System.out.println("El entrenador ha rechazado el traspaso de " + jugador.getNombre());
        }
    }

    /**
     * El presidente toma una decisión sobre el traspaso de un jugador.
     * 
     * @param jugador Jugador en proceso de traspaso.
     * @param equipo  Equipo al que se transferirá el jugador.
     * @param aceptar <code>true</code> si el presidente aprueba el traspaso, <code>false</code> si lo rechaza.
     */
    public static void decisionPresidente(Jugadores jugador, Equipo equipo, boolean aceptar) {
        if (jugador.getTraspaso() != TraspasoJugadores.aprobadoPorEntrenador) {
            System.out.println("El presidente no puede decidir hasta que el entrenador haya aprobado el traspaso.");
            return;
        }

        if (aceptar) {
            jugador.setTraspaso(TraspasoJugadores.aprobadoPorPresidente);
            System.out.println("El presidente ha aprobado el traspaso de " + jugador.getNombre());
            realizarTraspaso(jugador, equipo);
        } else {
            jugador.setTraspaso(TraspasoJugadores.rechazadoPorPresidente);
            System.out.println("El presidente ha rechazado el traspaso de " + jugador.getNombre());
        }
    }

    /**
     * Realiza el traspaso del jugador a un nuevo equipo.
     * 
     * @param jugador     Jugador a ser transferido.
     * @param nuevoEquipo Nuevo equipo al que se unirá el jugador.
     */
    private static void realizarTraspaso(Jugadores jugador, Equipo nuevoEquipo) {
        Equipo equipoActual = jugador.getEquipo();
        equipoActual.eliminarJugador(jugador);
        nuevoEquipo.agregarJugador(jugador);
        jugador.setTraspaso(TraspasoJugadores.sinSolicitar);

        System.out.println("Traspaso realizado: " + jugador.getNombre() + " se ha unido a " + nuevoEquipo.getNombreEquipo());
    }
}
