package com.grupo4entrega5.futbol.main;

import java.util.Calendar;
import java.util.Date;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Alineacion;
import com.grupo4entrega5.futbol.alineacion.Posiciones;
import com.grupo4entrega5.futbol.equipo.Entrenador;
import com.grupo4entrega5.futbol.equipo.Equipo;
import com.grupo4entrega5.futbol.equipo.Jugadores;
import com.grupo4entrega5.futbol.equipo.Presidente;

public class Main {

        public static Date crearFecha(int year, int month, int day) {
                Calendar cal = Calendar.getInstance();
                cal.set(year, month, day);
                Date date = cal.getTime();
                return cal.getTime();

        }

        public static void main(String[] args) throws Exception {
                Jugadores jugador1 = new Jugadores("Vinicius", crearFecha(2000, 7, 12), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 11);
                Jugadores jugador2 = new Jugadores("Maradona", crearFecha(2007, 1, 22), "Argentino",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 10);
                Jugadores jugador3 = new Jugadores("Isco", crearFecha(2002, 2, 11), "Español",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 22);
                Jugadores jugador4 = new Jugadores("Bicho", crearFecha(1999, 7, 4), "Portugal",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 7);
                Jugadores jugador5 = new Jugadores("La Pulga", crearFecha(1998, 3, 12), "Argentino",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 10);
                Jugadores jugador6 = new Jugadores("Pepe", crearFecha(1979, 2, 29), "Portugal",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 3);
                Jugadores jugador7 = new Jugadores("Iker Casillas", crearFecha(1989, 8, 1), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 1);
                Jugadores jugador8 = new Jugadores("Dani Alves", crearFecha(1996, 12, 31), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 2);
                Jugadores jugador9 = new Jugadores("Marcelo", crearFecha(1996, 11, 4), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 12);
                Jugadores jugador10 = new Jugadores("Zidane", crearFecha(2001, 1, 30), "Francia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 5);
                Jugadores jugador11 = new Jugadores("Modric", crearFecha(1985, 9, 9), "Croacia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 10);
                Jugadores jugador12 = new Jugadores("Sergio Ramos", crearFecha(1986, 3, 30), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 4);
                Jugadores jugador13 = new Jugadores("Xavi", crearFecha(1980, 1, 25), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 6);
                Jugadores jugador14 = new Jugadores("Iniesta", crearFecha(1984, 5, 11), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 8);
                Jugadores jugador15 = new Jugadores("Haaland", crearFecha(2000, 7, 21), "Noruega",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 9);
                Jugadores jugador16 = new Jugadores("Mbappé", crearFecha(1998, 12, 20), "Francia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 7);
                Jugadores jugador17 = new Jugadores("Lewandowski", crearFecha(1988, 8, 21), "Polonia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 9);
                Jugadores jugador18 = new Jugadores("Kroos", crearFecha(1990, 1, 4), "Alemania",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 8);
                Jugadores jugador19 = new Jugadores("Casemiro", crearFecha(1992, 2, 23), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 14);
                Jugadores jugador20 = new Jugadores("Oblak", crearFecha(1993, 1, 7), "Eslovenia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 1);

                System.out.println(jugador1);
                System.out.println(jugador2);
                System.out.println(jugador3);
                System.out.println(jugador4);
                System.out.println(jugador5);
                System.out.println(jugador6);
                System.out.println(jugador7);
                System.out.println(jugador8);
                System.out.println(jugador9);
                System.out.println(jugador10);
                System.out.println(jugador11);
                System.out.println(jugador12);
                System.out.println(jugador13);
                System.out.println(jugador14);
                System.out.println(jugador15);
                System.out.println(jugador16);
                System.out.println(jugador17);
                System.out.println(jugador18);
                System.out.println(jugador19);
                System.out.println(jugador20);
                Equipo equipo1 = new Equipo("Madrid", "R.M.A");
                Presidente presidente1 = new Presidente("20890547S", "Florentino Perez");
                Presidente presidente2 = new Presidente("20990547S", "Angel Haro");
                Presidente presidente3 = new Presidente("20790547S", "Enrique Zerezo");
                Presidente presidente4 = new Presidente("20690547S", "Laporta");
                Presidente presidente5 = new Presidente("20490547S", "Fernando Roig");
                System.out.println(presidente1);
                System.out.println(presidente2);
                System.out.println(presidente3);
                System.out.println(presidente4);
                System.out.println(presidente5);

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
