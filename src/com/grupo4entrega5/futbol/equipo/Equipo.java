package com.grupo4entrega5.futbol.equipo;
public class Equipo {
    private String NombreEquipo;
    private String Abreviatura;
    

    public Equipo(String NombreEquipo, String Abreviatura) {
        this.NombreEquipo = NombreEquipo;
        this.Abreviatura = Abreviatura;
    }

    public String getNombreEquipo(){
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo){
        this.NombreEquipo = NombreEquipo;

    }



    public String getAbreviatura(){
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura){
        this.Abreviatura = Abreviatura;

    }

}
