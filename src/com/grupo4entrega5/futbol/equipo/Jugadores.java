package com.grupo4entrega5.futbol.equipo;

import java.util.Date;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.alineacion.Posiciones;

/**
 * La clase <code>Jugadores</code> representa a un jugador de fútbol en un
 * equipo.
 * Contiene la información relevante como nombre, fecha de nacimiento,
 * nacionalidad,
 * dorsal, posición y detalles sobre su traspaso y equipo.
 * <p>
 * Esta clase también realiza el seguimiento de la cantidad de jugadores
 * creados.
 * </p>
 * 
 * @version 1.0
 */
public class Jugadores {

    /**
     * Nombre del jugador.
     */
    private String nombre;

    /**
     * Fecha de nacimiento del jugador.
     */
    private Date nacimiento;

    /**
     * Nacionalidad del jugador.
     */
    private String nacionalidad;

    /**
     * Posición en el campo del jugador.
     */
    private Posiciones posicion;

    /**
     * Dorsal del jugador.
     */
    private int dorsal;

    /**
     * Información sobre el traspaso del jugador.
     */
    private TraspasoJugadores traspaso;

    /**
     * El equipo al que pertenece el jugador.
     */
    private Equipo equipo;

    /**
     * Contador de la cantidad de jugadores creados.
     */
    private static int contadorJugadores = 0;

    /**
     * Constructor de la clase <code>Jugadores</code>. Inicializa un nuevo jugador
     * con los detalles proporcionados.
     * 
     * @param nombre       Nombre del jugador.
     * @param nacimiento   Fecha de nacimiento del jugador.
     * @param nacionalidad Nacionalidad del jugador.
     * @param traspaso     Información sobre el traspaso del jugador.
     * @param posicion     Posición en el campo del jugador.
     * @param dorsal       Dorsal del jugador.
     * @param equipo       El equipo al que pertenece el jugador.
     */
    public Jugadores(String nombre, Date nacimiento, String nacionalidad, TraspasoJugadores traspaso,
            Posiciones posicion, int dorsal, Equipo equipo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.traspaso = traspaso;
        this.equipo = equipo;
        this.traspaso = TraspasoJugadores.sinSolicitar;
        this.setDorsal(dorsal);
        contadorJugadores++;
    }

    /**
     * Obtiene el número de jugadores creados.
     * 
     * @return el número de jugadores.
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Establece el dorsal del jugador. El dorsal debe ser mayor o igual a 0.
     * Si el dorsal es negativo, no se establece.
     * 
     * @param dorsal El dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        if (dorsal >= 0) {
            this.dorsal = dorsal;
        } else {
            System.out.println("El dorsal debe ser positivo.");
        }
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return el nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombre El nuevo nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return la fecha de nacimiento del jugador.
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * 
     * @param nacimiento La nueva fecha de nacimiento del jugador.
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Obtiene la nacionalidad del jugador.
     * 
     * @return la nacionalidad del jugador.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece la nacionalidad del jugador.
     * 
     * @param nacionalidad La nueva nacionalidad del jugador.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene la posición en el campo del jugador.
     * 
     * @return la posición del jugador.
     */
    public Posiciones getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición en el campo del jugador.
     * 
     * @param posicion La nueva posición del jugador.
     */
    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el dorsal del jugador.
     * 
     * @return el dorsal del jugador.
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Obtiene la información sobre el traspaso del jugador.
     * 
     * @return el traspaso del jugador.
     */
    public TraspasoJugadores getTraspaso() {
        return traspaso;
    }

    /**
     * Establece la información sobre el traspaso del jugador.
     * 
     * @param traspaso La nueva información del traspaso del jugador.
     */
    public void setTraspaso(TraspasoJugadores traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * Obtiene el equipo al que pertenece el jugador.
     * 
     * @return el equipo del jugador.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo al que pertenece el jugador.
     * 
     * @param equipo El nuevo equipo del jugador.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Devuelve una representación en forma de cadena del jugador.
     * 
     * @return una cadena con los detalles del jugador.
     */
    public String toString() {
        return "Jugadores [nombre = " + nombre + ", nacimiento = " + nacimiento + ", nacionalidad = " + nacionalidad
                + ", posicion = " + posicion + ", dorsal = " + dorsal + ", traspaso = " + traspaso + ", equipo = "
                + equipo.getNombreEquipo()
                + "]";
    }
}
