package com.llogaauto;

public class Automobil {
    // Atributs
    String marca;
    String model;
    String matricula;
    
    // Variable de classe
    public static int comptador = 0;

    // constructors
    Automobil(String mar, String mod, String mat) {
        this.marca = mar;
        this.model = mod;
        this.matricula = mat;
        comptador ++;
    }

    Automobil(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        comptador --;
    }

    // metode de la classe
    public String mostrarDades() {
        return " marca : " + this.marca + "   model: " + this.model + "  matricula:" + this.matricula;
    }

    // funció de la classe
    public static boolean validarMatricula(String matricula) {

        // Regex: 4 dígits + 3 lletres majúscules (excloent vocals segons l'estàndard i
        // el test)
        return matricula != null && matricula.matches("^[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$");

    }

}
