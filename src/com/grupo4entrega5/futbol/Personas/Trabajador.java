package com.grupo4entrega5.futbol.Personas;

import java.util.Date;

/**
 * Clase abstracta que representa a un trabajador dentro del ámbito futbolístico.
 * Contiene información básica como nombre, fecha de nacimiento y país de origen.
 */
public abstract class Trabajador {
    protected String nombre;
    protected Date fechaNacimiento;
    protected String paisOrigen;

    /**
     * Constructor de la clase Trabajador.
     * 
     * @param nombre          Nombre del trabajador.
     * @param fechaNacimiento Fecha de nacimiento del trabajador.
     * @param paisOrigen      País de origen del trabajador.
     */
    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

    /**
     * Obtiene el nombre del trabajador.
     * 
     * @return Nombre del trabajador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del trabajador.
     * 
     * @param nombre Nuevo nombre del trabajador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del trabajador.
     * 
     * @return Fecha de nacimiento del trabajador.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del trabajador.
     * 
     * @param fechaNacimiento Nueva fecha de nacimiento del trabajador.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el país de origen del trabajador.
     * 
     * @return País de origen del trabajador.
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Establece el país de origen del trabajador.
     * 
     * @param paisOrigen Nuevo país de origen del trabajador.
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Método abstracto que deberá ser implementado por las subclases para 
     * mostrar la información específica del trabajador.
     */
    public abstract void mostrarInfo();

    /**
     * Obtiene la información general del trabajador en formato de texto.
     * 
     * @return Cadena de texto con el nombre, fecha de nacimiento y país de origen.
     */
    public String obtenerInfoGeneral() {
        return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", País de Origen: " + paisOrigen;
    }
}
