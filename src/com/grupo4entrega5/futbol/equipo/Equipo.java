package com.grupo4entrega5.futbol.equipo;

import java.util.ArrayList;
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;

/**
 * Representa un equipo de fútbol con su nombre, abreviatura, entrenador, presidente y jugadores.
 */
public class Equipo {

    private String NombreEquipo;
    private String Abreviatura;
    private Entrenador entrenador;
    private Presidente presidente;
    private ArrayList<Jugadores> jugadores;
    private static int contadorEquipos = 0;

    /**
     * Crea un equipo con los datos especificados.
     */
    public Equipo(String NombreEquipo, String Abreviatura, Entrenador entrenador, Presidente presidente) {
        this.NombreEquipo = NombreEquipo;
        this.Abreviatura = Abreviatura;
        this.entrenador = entrenador;
        this.presidente = presidente;
        this.jugadores = new ArrayList<>();
        contadorEquipos++;
    }

    public static int getContadorEquipos() {
        return contadorEquipos;
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

    /**
     * Devuelve los nombres de los jugadores en un solo string.
     */
    public String imprimirJugadores() {
        String resultado = "";
        for (int i = 0; i < jugadores.size(); i++) {
            resultado = resultado + jugadores.get(i).getNombre() + ", ";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Equipo [NombreEquipo = " + NombreEquipo + ", Abreviatura = " + Abreviatura + ", entrenador = "
                + entrenador.getNombre()
                + ", presidente = " + presidente.getNombrePresidente() + ", jugadores = " + imprimirJugadores() + "]";
    }

    /**
     * Agrega un jugador al equipo si aún no está en la lista.
     */
    public void agregarJugador(Jugadores jugador) {
        if (!jugadores.contains(jugador)) {
            jugadores.add(jugador);
        }
    }

    /**
     * Elimina un jugador del equipo.
     */
    public void eliminarJugador(Jugadores jugador) {
        jugadores.remove(jugador);
    }

    /**
     * Restablece el estado de traspaso de jugadores rechazados a "sin solicitar".
     */
    public void resetearTraspaso() {
        for (Jugadores jugador : jugadores) {
            if (jugador.getTraspaso() == TraspasoJugadores.rechazadoPorEntrenador
                    || jugador.getTraspaso() == TraspasoJugadores.rechazadoPorPresidente) {
                jugador.setTraspaso(TraspasoJugadores.sinSolicitar);
            }
        }
    }
}
