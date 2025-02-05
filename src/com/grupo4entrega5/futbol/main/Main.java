package com.grupo4entrega5.futbol.main;

import java.util.ArrayList;
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

                // CREAMOS LOS PRESIDENTES//
                Presidente presidente1 = new Presidente("20890547S", "Florentino Perez", null);
                Presidente presidente4 = new Presidente("20690547S", "Laporta", null);
                Presidente presidente3 = new Presidente("20790547S", "Enrique Cerezo", null);
                Presidente presidente2 = new Presidente("20990547S", "Angel Haro", null);
                Presidente presidente5 = new Presidente("20490547S", "Fernando Roig", null);
                
        //CREAMOS LOS ENTRENADORES//
                Entrenador entrenador1 = new Entrenador("Carlo Ancelotti", Alineacion._433, null);
                Entrenador entrenador2 = new Entrenador("Hansi Flick", Alineacion._442, null);
                Entrenador entrenador3 = new Entrenador("Diego Simeone", Alineacion._532, null);
                Entrenador entrenador4 = new Entrenador("Manuel Pellegrini", Alineacion._541, null);
                Entrenador entrenador5 = new Entrenador("Marcelino", Alineacion._4132, null);
                
                
        //CREAMOS LOS EQUIPOS//
                Equipo equipo1 = new Equipo("Real Madrid", "RMA", entrenador1, presidente1);
                Equipo equipo2 = new Equipo("FC Barcelona", "FCB", entrenador2, presidente2);
                Equipo equipo3 = new Equipo("Atlético de Madrid", "ATM", entrenador3, presidente3);
                Equipo equipo4 = new Equipo("Real Betis Balompié", "BET", entrenador4, presidente4);
                Equipo equipo5 = new Equipo("Villarreal CF", "VIL", entrenador5, presidente5);
                
        
                presidente1.setEquipo(equipo1);
                presidente2.setEquipo(equipo2);
                presidente3.setEquipo(equipo3);
                presidente4.setEquipo(equipo4);
                presidente5.setEquipo(equipo5);

                entrenador1.setEquipo(equipo1);
                entrenador2.setEquipo(equipo2);
                entrenador3.setEquipo(equipo3);
                entrenador4.setEquipo(equipo4);
                entrenador5.setEquipo(equipo5);

                // CREAMOS LOS JUGADORES//

                Jugadores jugador1 = new Jugadores("Vinicius", crearFecha(2000, 7, 12), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 11, equipo3);

                Jugadores jugador2 = new Jugadores("Maradona", crearFecha(2007, 1, 22), "Argentino",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 10, equipo4);

                Jugadores jugador3 = new Jugadores("Isco", crearFecha(2002, 2, 11), "Español",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 22, equipo1);

                Jugadores jugador4 = new Jugadores("Bicho", crearFecha(1999, 7, 4), "Portugal",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 7, equipo1);

                Jugadores jugador5 = new Jugadores("La Pulga", crearFecha(1998, 3, 12), "Argentino",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 10, equipo2);

                Jugadores jugador6 = new Jugadores("Pepe", crearFecha(1979, 2, 29), "Portugal",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 3, equipo3);

                Jugadores jugador7 = new Jugadores("Iker Casillas", crearFecha(1989, 8, 1), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 1, equipo1);

                Jugadores jugador8 = new Jugadores("Dani Alves", crearFecha(1996, 12, 31), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 2, equipo2);

                Jugadores jugador9 = new Jugadores("Marcelo", crearFecha(1996, 11, 4), "Brasil",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 12, equipo1);

                Jugadores jugador10 = new Jugadores("Zidane", crearFecha(2001, 1, 30), "Francia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 5, equipo2);

                Jugadores jugador11 = new Jugadores("Modric", crearFecha(1985, 9, 9), "Croacia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 10, equipo3);

                Jugadores jugador12 = new Jugadores("Sergio Ramos", crearFecha(1986, 3, 30), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 4, equipo4);

                Jugadores jugador13 = new Jugadores("Xavi", crearFecha(1980, 1, 25), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 6, equipo4);

                Jugadores jugador14 = new Jugadores("Iniesta", crearFecha(1984, 5, 11), "España",
                                TraspasoJugadores.sinSolicicitar, Posiciones.CentroCampista, 8, equipo5);

                Jugadores jugador15 = new Jugadores("Pepe Reina", crearFecha(2000, 7, 21), "Noruega",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 9, equipo3);

                Jugadores jugador16 = new Jugadores("Courtois", crearFecha(1998, 12, 20), "Belgica",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 7, equipo2);

                Jugadores jugador17 = new Jugadores("Iñaki Peña", crearFecha(1988, 8, 21), "Españpl",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 9, equipo4);

                Jugadores jugador18 = new Jugadores("Halland", crearFecha(1990, 1, 4), "Polonia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Delantero, 8, equipo5);

                Jugadores jugador19 = new Jugadores("Diego Lopez", crearFecha(1992, 2, 23), "Español",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Portero, 14, equipo5);

                Jugadores jugador20 = new Jugadores("Sergio Ramos", crearFecha(1993, 1, 7), "Eslovenia",
                                TraspasoJugadores.sinSolicicitar, Posiciones.Defensa, 93, equipo5);
                
                
                ArrayList <Jugadores> lista = new ArrayList<>();
                lista.add(jugador3);
                lista.add(jugador4);
                lista.add(jugador7);
                lista.add(jugador9);
                equipo1.setJugadores(lista);

                ArrayList <Jugadores> lista2 = new ArrayList<>();
                lista2.add(jugador5);
                lista2.add(jugador8);
                lista2.add(jugador10);
                lista2.add(jugador16);
                equipo2.setJugadores(lista2);

                ArrayList <Jugadores> lista3 = new ArrayList<>();
                lista3.add(jugador1);
                lista3.add(jugador6);
                lista3.add(jugador11);
                lista3.add(jugador15);
                equipo3.setJugadores(lista3);

                ArrayList <Jugadores> lista4 = new ArrayList<>();
                lista4.add(jugador2);
                lista4.add(jugador12);
                lista4.add(jugador13);
                lista4.add(jugador17);
                equipo4.setJugadores(lista4);

                ArrayList <Jugadores> lista5 = new ArrayList<>();
                lista5.add(jugador14);
                lista5.add(jugador18);
                lista5.add(jugador19);
                lista5.add(jugador20);
                equipo5.setJugadores(lista5);


                System.out.println(equipo1);
                System.out.println(equipo2);
                System.out.println(equipo3);
                System.out.println(equipo4);
                System.out.println(equipo5);
                System.out.println();

                System.out.println(entrenador1);
                System.out.println(entrenador2);
                System.out.println(entrenador3);
                System.out.println(entrenador4);
                System.out.println(entrenador5);
                System.out.println();

                System.out.println(presidente1);
                System.out.println(presidente2);
                System.out.println(presidente3);
                System.out.println(presidente4);
                System.out.println(presidente5);
                System.out.println();

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

                

                
               
                
        }
}
