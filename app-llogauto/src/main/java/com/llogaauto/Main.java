package com.llogaauto;

public class Main {
    public static void main(String[] args) {
        
        Automobil auto1 = new Automobil("Seat", "Ibiza", "1234HJK");
        System.out.println(auto1.mostrarDades());
        if(Automobil.validarMatricula(auto1.matricula)){
            System.out.println(" El cotxe " + auto1.marca + "  " + auto1.model + " amb matricula " + auto1.matricula + " BEN MATRICULAT");
        } else {
             System.out.println(" El cotxe " + auto1.marca + "  " + auto1.model + " amb matricula " + auto1.matricula + " MATRICULA INCORRECTA ");
        }

    }
}