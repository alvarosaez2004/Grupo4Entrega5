package com.grupo4entrega5.futbol.traspasos;

import com.grupo4entrega5.futbol.equipo.Jugadores;

/**
 * Interfaz que define los métodos para gestionar el traspaso de jugadores.
 */
public interface GestorTraspasos {

    /**
     * Aprueba el traspaso de un jugador a otro equipo.
     * 
     * @param jugador Jugador cuyo traspaso será aprobado.
     */
    void aprobarTraspaso(Jugadores jugador);

    /**
     * Rechaza el traspaso de un jugador, manteniéndolo en su equipo actual.
     * 
     * @param jugador Jugador cuyo traspaso será rechazado.
     */
    void rechazarTraspaso(Jugadores jugador);
}
