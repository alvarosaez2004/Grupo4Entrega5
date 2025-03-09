package com.grupo4entrega5.futbol.equipo;

import java.util.Date;

import com.grupo4entrega5.futbol.Fichajes.TraspasoJugadores;
import com.grupo4entrega5.futbol.Personas.Trabajador;
import com.grupo4entrega5.futbol.traspasos.GestorTraspasos;

public class Presidente extends Trabajador implements GestorTraspasos {

    private String dni; // Atributo específico del presidente.
    private Equipo equipo; // El equipo al que pertenece el presidente.

    public Presidente(String dni, String nombre, Date fechaNacimiento, String paisOrigen, Equipo equipo) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.dni = dni;
        this.equipo = equipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(obtenerInfoGeneral() + ", DNI: " + dni + ", Equipo: " + equipo.getNombreEquipo());
    }

    // Implementación de los métodos de la interfaz GestorTraspasos
    @Override
    public void aprobarTraspaso(Jugadores jugador) {
        jugador.setTraspaso(TraspasoJugadores.aprobadoPorPresidente);
        System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aprobado por el presidente.");
    }

    @Override
    public void rechazarTraspaso(Jugadores jugador) {
        jugador.setTraspaso(TraspasoJugadores.rechazadoPorPresidente);
        System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el presidente.");
    }

    // Getter para obtener el nombre del presidente
    public String getNombrePresidente() {
        return getNombre(); // Usamos el getter heredado de la clase Trabajador
    }

    // Getters y Setters para los atributos de Presidente
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
