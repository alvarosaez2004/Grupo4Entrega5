package com.grupo4entrega5.futbol.traspasos;

import com.grupo4entrega5.futbol.equipo.Jugadores;

public interface GestorTraspasos {

    // Método para aprobar el traspaso de un jugador
    void aprobarTraspaso(Jugadores jugador);

    // Método para rechazar el traspaso de un jugador
    void rechazarTraspaso(Jugadores jugador);
}
