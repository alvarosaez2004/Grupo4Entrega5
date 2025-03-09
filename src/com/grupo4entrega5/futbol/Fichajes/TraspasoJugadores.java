package com.grupo4entrega5.futbol.Fichajes;

/**
 * Enumeración <code>TraspasoJugadores</code> que representa los diferentes estados
 * en los que puede encontrarse un traspaso de jugador.
 */
public enum TraspasoJugadores {
    /**
     * El traspaso no ha sido solicitado.
     */
    sinSolicitar,
    
    /**
     * El traspaso ha sido aprobado por el entrenador.
     */
    aprobadoPorEntrenador,
    
    /**
     * El traspaso ha sido aprobado por el presidente.
     */
    aprobadoPorPresidente,
    
    /**
     * El traspaso ha sido rechazado por el entrenador.
     */
    rechazadoPorEntrenador,
    
    /**
     * El traspaso ha sido rechazado por el presidente.
     */
    rechazadoPorPresidente,
    
    /**
     * El traspaso ha sido solicitado.
     */
    solicitado
}
