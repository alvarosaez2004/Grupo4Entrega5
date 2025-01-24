import java.sql.Date;

public class Jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;
    public Posiciones posicion;
    public int dorsal;
    public TraspasoJugadores traspaso;

    public Jugadores (String nombre, Date nacimiento, String nacionalidad, Posiciones posicion, int dorsal, TraspasoJugadores traspaso){
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.dorsal = dorsal;

        if (dorsal < 1 || dorsal >99){
            System.out.println("El dorsal no es válido");
            return;
        }
        this.traspaso = traspaso;

    
        }

    }
    

