import java.sql.Date;

public class Jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;
    public Posiciones posicion;
    public int dorsal;
    public TraspasoJugadores traspaso;

    public Jugadores(String nombre, Date nacimiento, String nacionalidad, TraspasoJugadores traspaso,
            Posiciones posicion, int dorsal) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.traspaso = traspaso;
        this.posicion = posicion;
        this.dorsal = dorsal;

    }
}