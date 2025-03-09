package com.grupo4entrega5.futbol.equipo;

import java.util.ArrayList;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;

/**
 * La clase <code>Equipo</code> representa a un equipo de fútbol.
 * Contiene información relevante como el nombre del equipo, su abreviatura,
 * el entrenador, el presidente, y los jugadores que pertenecen a dicho equipo.
 * Además, proporciona métodos para agregar y eliminar jugadores, así como
 * realizar operaciones relacionadas con el traspaso de los mismos.
 * 
 * <p>
 * El equipo mantiene un contador estático para hacer el seguimiento de la
 * cantidad de equipos creados.
 * </p>
 * 
 * 
 * @version 1.0
 */
public class Equipo {

    /**
     * Nombre completo del equipo.
     */
    private String NombreEquipo;

    /**
     * Abreviatura del nombre del equipo.
     */
    private String Abreviatura;

    /**
     * Entrenador del equipo.
     */
    private Entrenador entrenador;

    /**
     * Presidente del equipo.
     */
    private Presidente presidente;

    /**
     * Lista de jugadores que pertenecen al equipo.
     */
    private ArrayList<Jugadores> jugadores;

    /**
     * Contador estático de equipos creados.
     */
    private static int contadorEquipos = 0;

    /**
     * Constructor de la clase <code>Equipo</code>. Inicializa un nuevo equipo con
     * los detalles proporcionados.
     * 
     * @param NombreEquipo Nombre completo del equipo.
     * @param Abreviatura  Abreviatura del equipo.
     * @param entrenador   Entrenador del equipo.
     * @param presidente   Presidente del equipo.
     */
    public Equipo(String NombreEquipo, String Abreviatura, Entrenador entrenador, Presidente presidente) {
        this.NombreEquipo = NombreEquipo;
        this.Abreviatura = Abreviatura;
        this.entrenador = entrenador;
        this.presidente = presidente;
        this.jugadores = new ArrayList<>();
        contadorEquipos++;
    }

    /**
     * Obtiene el número de equipos creados.
     * 
     * @return el número de equipos creados.
     */
    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    /**
     * Obtiene el nombre completo del equipo.
     * 
     * @return el nombre completo del equipo.
     */
    public String getNombreEquipo() {
        return NombreEquipo;
    }

    /**
     * Establece el nombre completo del equipo.
     * 
     * @param nombreEquipo El nuevo nombre completo del equipo.
     */
    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }

    /**
     * Obtiene la abreviatura del equipo.
     * 
     * @return la abreviatura del equipo.
     */
    public String getAbreviatura() {
        return Abreviatura;
    }

    /**
     * Establece la abreviatura del equipo.
     * 
     * @param abreviatura La nueva abreviatura del equipo.
     */
    public void setAbreviatura(String abreviatura) {
        Abreviatura = abreviatura;
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return el entrenador del equipo.
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Establece el entrenador del equipo.
     * 
     * @param entrenador El nuevo entrenador del equipo.
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Obtiene el presidente del equipo.
     * 
     * @return el presidente del equipo.
     */
    public Presidente getPresidente() {
        return presidente;
    }

    /**
     * Establece el presidente del equipo.
     * 
     * @param presidente El nuevo presidente del equipo.
     */
    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    /**
     * Obtiene la lista de jugadores que pertenecen al equipo.
     * 
     * @return la lista de jugadores del equipo.
     */
    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    /**
     * Establece la lista de jugadores del equipo.
     * 
     * @param jugadores La nueva lista de jugadores del equipo.
     */
    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Imprime los nombres de los jugadores del equipo en un formato de cadena.
     * 
     * @return una cadena con los nombres de todos los jugadores del equipo.
     */
    public String imprimirJugadores() {
        String resultado = "";
        for (int i = 0; i < jugadores.size(); i++) {
            resultado = resultado + jugadores.get(i).getNombre() + ", ";
        }
        return resultado;
    }

    /**
     * Devuelve una representación en forma de cadena del equipo.
     * 
     * @return una cadena con los detalles del equipo.
     */
    public String toString() {
        return "Equipo [NombreEquipo = " + NombreEquipo + ", Abreviatura = " + Abreviatura + ", entrenador = "
                + entrenador.getNombre()
                + ", presidente = " + presidente.getNombrePresidente() + ", jugadores = " + imprimirJugadores() + "]";
    }

    /**
     * Agrega un jugador al equipo.
     * 
     * @param jugador El jugador que se agregará al equipo.
     */
    public void agregarJugador(Jugadores jugador) {
        jugadores.add(jugador);
    }

    /**
     * Elimina un jugador del equipo.
     * 
     * @param jugador El jugador que se eliminará del equipo.
     */
    public void eliminarJugador(Jugadores jugador) {
        jugadores.remove(jugador);
    }

    /**
     * Resetea el estado de traspaso de todos los jugadores del equipo.
     * Si el traspaso fue rechazado por el entrenador o presidente, se restablece al
     * estado de "sin solicitar".
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
