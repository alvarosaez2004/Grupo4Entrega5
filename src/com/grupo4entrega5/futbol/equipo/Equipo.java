package com.grupo4entrega5.futbol.equipo;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {
    private String NombreEquipo;
    private String Abreviatura;
    private Entrenador entrenador;
    private Presidente presidente;
    private ArrayList <Jugadores> jugadores;

   


    
    public Equipo(String NombreEquipo, String Abreviatura, Entrenador entrenador, Presidente presidente) {
        this.NombreEquipo = NombreEquipo;
        this.Abreviatura = Abreviatura;
        this.entrenador = entrenador;
        this.presidente = presidente;
    }
    
   
   

    public String getNombreEquipo() {
        return NombreEquipo;
    }


    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }


    public String getAbreviatura() {
        return Abreviatura;
    }


    public void setAbreviatura(String abreviatura) {
        Abreviatura = abreviatura;
    }
    
    public Entrenador getEntrenador() {
        return entrenador;
    }


    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    } 
    
    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    } 

    public String imprimirJugadores() {
        String resultado = "";
        for (int i = 0; i < jugadores.size(); i++) {
                resultado = resultado + jugadores.get(i).getNombre() + ", ";
        }
        return resultado;
    }

    public String toString() {
        return "Equipo [NombreEquipo = " + NombreEquipo + ", Abreviatura = " + Abreviatura + ", entrenador = " + entrenador.getNombre()
                + ", presidente = " + presidente.getNombrePresidente() + ", jugadores = " + imprimirJugadores() + "]";
    }
}

    
