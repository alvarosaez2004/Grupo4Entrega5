package com.grupo4entrega5.futbol.main;
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;
import com.grupo4entrega5.futbol.equipo.Jugadores;

public class Main {
    public static void main(String[] args) throws Exception {
       Jugadores jugador1 = new Jugadores("Vinicius", null, "Brasil", Posiciones.Delantero, 1000, TraspasoJugadores.sinSolicicitar);
    }
}
