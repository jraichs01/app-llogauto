package com.llogaauto;

public class GestorAutomobils {
    private Automobil[] llistaCotxes;

    GestorAutomobils(int capacitat){
        this.llistaCotxes = new Automobil[capacitat];
    }

    public void afegirAutomobil(Automobil auto){
        
        if (this.llistaCotxes.length == Automobil.getComptador()){
            System.out.println("El consessionari està ple");
        } else {
            // afegir l'automobila a partir del últim
            for(int i = 0; i < this.llistaCotxes.length; i++){
                if(this.llistaCotxes[i] == null){
                    this.llistaCotxes[i] = auto;
                }
            }
        }
    }

    public void llistarAutomobils(){
        for(int i = 0; i < this.llistaCotxes.length; i++){
            if (this.llistaCotxes[i] != null) {
                System.out.println(" marca :" + this.llistaCotxes[i].getMarca() +
                                " model :" + this.llistaCotxes[i].getModel() +
                                " matricula :" + this.llistaCotxes[i].getMatricula() );
            }
        }
    }

}
