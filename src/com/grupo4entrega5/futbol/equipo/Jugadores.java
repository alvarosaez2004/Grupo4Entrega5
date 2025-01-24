package com.grupo4entrega5.futbol.equipo;

import java.sql.Date;

<<<<<<< HEAD:src/jugadores.java
=======
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;

>>>>>>> d4b5c73dcb701a8cea97e4583cd9ff0c1a346196:src/com/grupo4entrega5/futbol/equipo/Jugadores.java
public class Jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;
    public Posiciones posicion;
    public int dorsal;
    public TraspasoJugadores traspaso;

<<<<<<< HEAD:src/jugadores.java
    public Jugadores (String nombre, Date nacimiento, String nacionalidad, Posiciones posicion, int dorsal, TraspasoJugadores traspaso){
=======
    public Jugadores(String nombre, Date nacimiento, String nacionalidad, TraspasoJugadores traspaso,
            Posiciones posicion, int dorsal) {
>>>>>>> d4b5c73dcb701a8cea97e4583cd9ff0c1a346196:src/com/grupo4entrega5/futbol/equipo/Jugadores.java
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.dorsal = dorsal;

        if (dorsal < 1 || dorsal >99){
            System.out.println("El dorsal no es válido");
            return;
        }
        this.traspaso = traspaso;

    
        }

    }
    

