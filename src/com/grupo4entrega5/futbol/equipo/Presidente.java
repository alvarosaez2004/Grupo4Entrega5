package com.grupo4entrega5.futbol.equipo;

import java.util.Date;
import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.Personas.Trabajador;
import com.grupo4entrega5.futbol.traspasos.GestorTraspasos;

/**
 * La clase <code>Presidente</code> representa al presidente de un equipo de fútbol.
 * Hereda de {@link Trabajador} y implementa la interfaz {@link GestorTraspasos}.
 */
public class Presidente extends Trabajador implements GestorTraspasos {

    /**
     * DNI del presidente.
     */
    private String dni;

    /**
     * Equipo al que pertenece el presidente.
     */
    private Equipo equipo;

    /**
     * Constructor de la clase <code>Presidente</code>.
     * 
     * @param dni            Documento de identidad del presidente.
     * @param nombre         Nombre del presidente.
     * @param fechaNacimiento Fecha de nacimiento del presidente.
     * @param paisOrigen     País de origen del presidente.
     * @param equipo         Equipo al que pertenece el presidente.
     */
    public Presidente(String dni, String nombre, Date fechaNacimiento, String paisOrigen, Equipo equipo) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.dni = dni;
        this.equipo = equipo;
    }

    /**
     * Muestra la información del presidente, incluyendo su DNI y el equipo al que pertenece.
     * Sobrescribe el método {@link Trabajador#mostrarInfo()}.
     */
    @Override
    public void mostrarInfo() {
        System.out.println(obtenerInfoGeneral() + ", DNI: " + dni + ", Equipo: " + equipo.getNombreEquipo());
    }

    /**
     * Aprueba el traspaso de un jugador.
     * 
     * @param jugador Jugador cuyo traspaso será aprobado.
     */
    @Override
    public void aprobarTraspaso(Jugadores jugador) {
        jugador.setTraspaso(TraspasoJugadores.aprobadoPorPresidente);
        System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aprobado por el presidente.");
    }

    /**
     * Rechaza el traspaso de un jugador.
     * 
     * @param jugador Jugador cuyo traspaso será rechazado.
     */
    @Override
    public void rechazarTraspaso(Jugadores jugador) {
        jugador.setTraspaso(TraspasoJugadores.rechazadoPorPresidente);
        System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el presidente.");
    }

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return Nombre del presidente.
     */
    public String getNombrePresidente() {
        return getNombre();
    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return DNI del presidente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del presidente.
     * 
     * @param dni Nuevo DNI del presidente.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el equipo al que pertenece el presidente.
     * 
     * @return El equipo del presidente.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo del presidente.
     * 
     * @param equipo Nuevo equipo del presidente.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
