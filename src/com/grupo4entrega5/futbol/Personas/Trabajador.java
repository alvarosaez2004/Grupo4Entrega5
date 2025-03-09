package com.grupo4entrega5.futbol.Personas;

import java.util.Date;

public abstract class Trabajador {
    protected String nombre;
    protected Date fechaNacimiento;
    protected String paisOrigen;

    // Constructor de la clase Trabajador
    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public abstract void mostrarInfo();

    public String obtenerInfoGeneral() {
        return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", País de Origen: " + paisOrigen;
    }
}
