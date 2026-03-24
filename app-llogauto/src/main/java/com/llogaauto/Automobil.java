package com.llogaauto;

public class Automobil {
    // Atributs
    String marca;
    String model;
    String matricula;

    // mètodes
    Automobil(String mar, String mod, String mat){
        this.marca = mar;
        this.model = mod;
        this.matricula = mat;
    }

    public String mostrarDades(){
        return " marca : " + this.marca + "   model: " + this.model + "  matricula:" + this.matricula;
    }


    
}
