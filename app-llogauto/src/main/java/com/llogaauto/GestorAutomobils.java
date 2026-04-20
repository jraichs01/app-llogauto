package com.llogaauto;

public class GestorAutomobils {
    // Atribut privat: un array d'objectes de tipus Automobil
    private Automobil[] llistaAutos;
  
    // Constructor: inicialitza l'array amb la capacitat especificada
    public GestorAutomobils(int capacitat) {
        this.llistaAutos = new Automobil[capacitat];
    }

    /**
     * Afegeix un automòbil en una posició específica de l'array.
     * @param posicio L'índex de l'array (0 a capacitat-1)
     * @param auto L'objecte Automobil a afegir
     */
    public void afegirAutomobil(int posicio, Automobil auto) {
        if (posicio >= 0 && posicio < llistaAutos.length) {
            llistaAutos[posicio] = auto;
        } else {
            System.out.println("Error: Posició fora de rang.");
        }
    }

    /**
     * Recorre l'array i mostra per pantalla els detalls dels automòbils existents.
     */
    public void llistarAutomobils() {
        System.out.println("--- Llista d'Automòbils ---");
        for (int i = 0; i < llistaAutos.length; i++) {
            if (llistaAutos[i] != null) {
                System.out.println(llistaAutos[i].mostrarDades());
            } 
        }
    }

    /**
     * Retorna el nombre d'automobils de l'agencia
     */
    public int getNumAutos(){
        return llistaAutos.length;
    }



}