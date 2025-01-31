package com.grupo4entrega5.futbol.main;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Alineacion;
import com.grupo4entrega5.futbol.alineacion.Posiciones;
import com.grupo4entrega5.futbol.equipo.Entrenador;
import com.grupo4entrega5.futbol.equipo.Equipo;
import com.grupo4entrega5.futbol.equipo.Jugadores;

public class Main {
    public static void main(String[] args) throws Exception {

        Entrenador entrenador1 = new Entrenador("Carlo Ancelotti", Alineacion._433);
        Entrenador entrenador2 = new Entrenador("Hansi Flick", Alineacion._442);
        Entrenador entrenador3 = new Entrenador("Diego Simeone", Alineacion._532);
        Entrenador entrenador4 = new Entrenador("Manuel Pellegrini", Alineacion._541);
        Entrenador entrenador5 = new Entrenador("Marcelino", Alineacion._4132);

        Equipo equipo1 = new Equipo("Real Madrid", "RMA");
        Equipo equipo2 = new Equipo("FC Barcelona", "FCB");
        Equipo equipo3 = new Equipo("Atlético de Madrid", "ATM");
        Equipo equipo4 = new Equipo("Real Betis Balompié", "BET");
        Equipo equipo5 = new Equipo("Villarreal CF", "VIL");


        System.out.println(entrenador1);
        System.out.println(entrenador2);
        System.out.println(entrenador3);
        System.out.println(entrenador4);
        System.out.println(entrenador5);

        System.out.println(equipo1);
        System.out.println(equipo2);
        System.out.println(equipo3);
        System.out.println(equipo4);
        System.out.println(equipo5);

    }
}
