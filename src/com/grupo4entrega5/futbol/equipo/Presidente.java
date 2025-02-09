package com.grupo4entrega5.futbol.equipo;

/**
 * La clase <code>Presidente</code> representa a un presidente de un equipo de
 * fútbol.
 * Contiene la información relevante del presidente, como su DNI, su nombre y el
 * equipo al que dirige.
 * 
 * <p>
 * El presidente es responsable de la gestión administrativa y organizativa del
 * equipo.
 * </p>
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Presidente {

    /**
     * El DNI del presidente.
     */
    private String dni;

    /**
     * El nombre del presidente.
     */
    private String nombrePresidente;

    /**
     * El equipo al que pertenece el presidente.
     */
    private Equipo equipo;

    /**
     * Constructor de la clase <code>Presidente</code>. Inicializa un nuevo
     * presidente con los detalles proporcionados.
     * 
     * @param dni              El DNI del presidente.
     * @param nombrePresidente El nombre del presidente.
     * @param equipo           El equipo al que pertenece el presidente.
     */
    public Presidente(String dni, String nombrePresidente, Equipo equipo) {
        this.dni = dni;
        this.nombrePresidente = nombrePresidente;
        this.equipo = equipo;
    }

    /**
     * Obtiene el equipo al que pertenece el presidente.
     * 
     * @return El equipo al que pertenece el presidente.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo al que pertenece el presidente.
     * 
     * @param equipo El nuevo equipo al que pertenece el presidente.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return El DNI del presidente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del presidente.
     * 
     * @param dni El nuevo DNI del presidente.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return El nombre del presidente.
     */
    public String getNombrePresidente() {
        return nombrePresidente;
    }

    /**
     * Establece el nombre del presidente.
     * 
     * @param nombrePresidente El nuevo nombre del presidente.
     */
    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    /**
     * Devuelve una representación en forma de cadena del presidente.
     * 
     * @return Una cadena con los detalles del presidente.
     */
    @Override
    public String toString() {
        return "Presidente [dni = " + dni + ", nombrePresidente = " + nombrePresidente + ", equipo = "
                + equipo.getNombreEquipo() + "]";
    }
}
