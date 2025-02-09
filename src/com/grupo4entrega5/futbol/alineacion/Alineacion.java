package com.grupo4entrega5.futbol.alineacion;

/**
 * El <code>enum</code> <code>Alineacion</code> representa las formaciones
 * tácticas que un equipo de fútbol puede adoptar.
 * Cada formación está basada en la disposición de los jugadores en el campo,
 * especialmente en la distribución de defensores, centrocampistas y delanteros.
 * 
 * <p>
 * Las formaciones comunes incluyen:
 * </p>
 * <ul>
 * <li><code>_442</code>: Cuatro defensores, cuatro centrocampistas y dos
 * delanteros.</li>
 * <li><code>_433</code>: Cuatro defensores, tres centrocampistas y tres
 * delanteros.</li>
 * <li><code>_451</code>: Cuatro defensores, cinco centrocampistas y un
 * delantero.</li>
 * <li><code>_343</code>: Tres defensores, cuatro centrocampistas y tres
 * delanteros.</li>
 * <li><code>_541</code>: Cinco defensores, cuatro centrocampistas y un
 * delantero.</li>
 * <li><code>_532</code>: Cinco defensores, tres centrocampistas y dos
 * delanteros.</li>
 * <li><code>_352</code>: Tres defensores, cinco centrocampistas y dos
 * delanteros.</li>
 * <li><code>_4231</code>: Cuatro defensores, dos centrocampistas, tres
 * mediocampistas ofensivos y un delantero.</li>
 * <li><code>_4132</code>: Cuatro defensores, un centrocampista defensivo, tres
 * centrocampistas ofensivos y dos delanteros.</li>
 * </ul>
 * 
 * <p>
 * Este <code>enum</code> proporciona un conjunto de formaciones estándar que
 * pueden ser utilizadas para la táctica de un equipo de fútbol.
 * </p>
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public enum Alineacion {
    /**
     * Formación 4-4-2: Cuatro defensores, cuatro centrocampistas y dos delanteros.
     */
    _442,

    /**
     * Formación 4-3-3: Cuatro defensores, tres centrocampistas y tres delanteros.
     */
    _433,

    /**
     * Formación 4-5-1: Cuatro defensores, cinco centrocampistas y un delantero.
     */
    _451,

    /**
     * Formación 3-4-3: Tres defensores, cuatro centrocampistas y tres delanteros.
     */
    _343,

    /**
     * Formación 5-4-1: Cinco defensores, cuatro centrocampistas y un delantero.
     */
    _541,

    /**
     * Formación 5-3-2: Cinco defensores, tres centrocampistas y dos delanteros.
     */
    _532,

    /**
     * Formación 3-5-2: Tres defensores, cinco centrocampistas y dos delanteros.
     */
    _352,

    /**
     * Formación 4-2-3-1: Cuatro defensores, dos centrocampistas, tres
     * mediocampistas ofensivos y un delantero.
     */
    _4231,

    /**
     * Formación 4-1-3-2: Cuatro defensores, un centrocampista defensivo, tres
     * centrocampistas ofensivos y dos delanteros.
     */
    _4132
}
