package com.grupo4entrega5.futbol.equipo;
import com.grupo4entrega5.futbol.alineacion.Alineacion;

public class Entrenador {
    private String Nombre;
    private Alineacion Al_fav;
    private Equipo equipo;





public Entrenador(String Nombre, Alineacion Alineacion, Equipo equipo){
    this.Nombre = Nombre;
    this.Al_fav = Alineacion;
    this.equipo = equipo;

}



    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public Alineacion getAl_fav(){
        return Al_fav;
    }

    public void setAl_fav(Alineacion Alineacion){
        this.Al_fav = Alineacion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }    

    public String toString() {
        return "Entrenador [Nombre = " + Nombre + ", Al_fav = " + Al_fav + ", equipo = " + equipo.getNombreEquipo() + "]";
}
}
