package com.grupo4entrega5.futbol.Fichajes;

import com.grupo4entrega5.futbol.equipo.Equipo;
import com.grupo4entrega5.futbol.equipo.Jugadores;

public class TraspasoManager {

    private static int contadorTraspasoManager = 0;

    public TraspasoManager() {
        contadorTraspasoManager++;
    }

    public static int getcontadorTraspasoManager() {
        return contadorTraspasoManager;
    }

    public static void Traspaso(Jugadores jugador) {
        if (jugador.getTraspaso() == TraspasoJugadores.sinSolicitar) {
            jugador.setTraspaso(TraspasoJugadores.solicitado);
            System.out.println("Solicitud de traspaso enviada para " + jugador.getNombre());
        } else {
            System.out.println("El jugador ya tiene una solicitud de traspaso en curso.");
        }
    }

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

    private static void realizarTraspaso(Jugadores jugador, Equipo nuevoEquipo) {
        Equipo equipoActual = jugador.getEquipo();
        equipoActual.eliminarJugador(jugador);
        nuevoEquipo.agregarJugador(jugador);
        jugador.setTraspaso(TraspasoJugadores.sinSolicitar);

        System.out.println(
                "Traspaso realizado: " + jugador.getNombre() + " Se ha unido a " + nuevoEquipo.getNombreEquipo());
    }

}
