package com.llogaauto;

public abstract class Automobil {
    // Atributs
    private String marca;
    private String model;
    private String matricula;
    private TipusCombustible combustible;
   
    // Variable de classe
    private static int comptador = 0;

    // constructors
    Automobil(String mar, String mod, String mat, TipusCombustible combu) {
        this.marca = mar;
        this.model = mod;
        this.matricula = mat;
        this.combustible = combu;
        Automobil.comptador ++;
    }

    Automobil(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        this.combustible = null;
        Automobil.comptador ++;
    }

    // *********** Getters i Setters ***********

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

    public TipusCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipusCombustible combustible) {
        this.combustible = combustible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //**** metodes ************************
    public String mostrarDades() {
        return " marca : " + this.marca + "   model: " + this.model + "  matricula:" + this.matricula;
    }

    // ***** Funcions de la classe ********
    public static int getComptador() {
        return comptador;
    }

    public static void setComptador(int comptador) {
        Automobil.comptador = comptador;
    }
   
    public static boolean validarMatricula(String matricula) {

        // Regex: 4 dígits + 3 lletres majúscules (excloent vocals segons l'estàndard i
        // el test)
        return matricula != null && matricula.matches("^[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$");

    }

}
