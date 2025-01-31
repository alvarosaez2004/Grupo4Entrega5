package com.grupo4entrega5.futbol.equipo;
import com.grupo4entrega5.futbol.alineacion.Alineacion;

public class Entrenador {
    private String Nombre;
    private Alineacion Al_fav;



public Entrenador(String Nombre, Alineacion Alineacion){
    this.Nombre = Nombre;
    this.Al_fav = Alineacion;

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
    
}
