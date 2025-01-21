import java.sql.Date;

public class jugadores {

    public String nombre;
    public Date nacimiento;
    public String nacionalidad;

    public enum posiciones {
        Portero, Defensa, CentroCampista, Delantero
    }

    public int dorsal;

    public enum traspaso {
        sinSolicitar, solicitado, aprobadoPorEntrenador, aprobadoPorPresidente, rechazadoPorEntrenador,
        rechazadoPorPresidente
    }
}
