package com.llogaauto;

public class Automobil {
    // Atributs
    private String marca;
    private String model;
    private String matricula;
   
    // Variable de classe
    private static int comptador = 0;

    // constructors
    Automobil(String mar, String mod, String mat) {
        this.marca = mar;
        this.model = mod;
        this.matricula = mat;
        Automobil.comptador ++;
    }

    Automobil(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        Automobil.comptador ++;
    }

    // Getters i Setters

    public String getMarca(){
        return this.marca;
    }

    public String getModel() {
        return model;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // setter i getter del comptador.
    public static int getComptador() {
        return comptador;
    }

    public static void setComptador(int comptador) {
        Automobil.comptador = comptador;
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
