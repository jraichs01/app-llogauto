package com.llogaauto;

public class GestorAutomobils {
    // Atribut privat: un array d'objectes de tipus Automobil
    private Automobil[] llistaCotxes;

    // Constructor: inicialitza l'array amb la capacitat especificada
    public GestorAutomobils(int capacitat) {
        this.llistaCotxes = new Automobil[capacitat];
    }

    /**
     * Afegeix un automòbil en una posició específica de l'array.
     * @param posicio L'índex de l'array (0 a capacitat-1)
     * @param auto L'objecte Automobil a afegir
     */
    public void afegirAutomobil(int posicio, Automobil auto) {
        if (posicio >= 0 && posicio < llistaCotxes.length) {
            llistaCotxes[posicio] = auto;
        } else {
            System.out.println("Error: Posició fora de rang.");
        }
    }

    /**
     * Recorre l'array i mostra per pantalla els detalls dels automòbils existents.
     */
    public void llistarAutomobils() {
        System.out.println("--- Llista d'Automòbils ---");
        for (int i = 0; i < llistaCotxes.length; i++) {
            if (llistaCotxes[i] != null) {
                // Suposem que la classe Automobil té un mètode toString() definit
                //System.out.println("Posició " + i + ": " + llistaCotxes[i].toString());

                // Modificació de la funció per llistar automobils

                System.out.println(" Marca :" + llistaCotxes[i].getMarca());
                System.out.println(" Model :" + llistaCotxes[i].getModel());
                System.out.println(" Matricula :" + llistaCotxes[i].getMatricula());
             
                
            } else {
              //  System.out.println("Posició " + i + ": [Buit]");
            }
        }
    }

    /**
     * Retorna el nombre d'automobils de l'agencia
     */
    public int getNumCotxes(){
        return llistaCotxes.length;
    }

}