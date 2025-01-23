import java.sql.Date;

public class jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;
    public Posiciones posicion;
    public int dorsal;
    public traspasojugadores traspaso;

    public jugadores(String nombre, Date nacimiento, String nacionalidad, traspasojugadores traspaso,
            Posiciones posicion, int dorsal) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.traspaso = traspaso;
        this.posicion = posicion;
        this.dorsal = dorsal;

    }
}