package com.llogaauto;

public class Camio extends Automobil{
    private float tara;
    private float pesMaxim;

     // Constructor
    Camio(String marca, String model, String matricula, TipusCombustible combustible,float tara,float pesMaxim){
        // Cridem el constructor de la classe pare
        super(marca,model,matricula,combustible);
        this.tara = tara;
        this.pesMaxim = pesMaxim;
    }

    Camio(){
        super("","","",null);
        this.tara = 0;
        this.pesMaxim = 0;
    }

    // *** Setters i Getters
    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public float getPesMaxim() {
        return pesMaxim;
    }

    public void setPesMaxim(float pesMaxim) {
        this.pesMaxim = pesMaxim;
    }

    // Sobrecarreguem mostrarDades
    @Override
    public String mostrarDades(){
        return super.mostrarDades() + " Tara : " + this.tara + " Pes Màxim : " + this.pesMaxim;
    }

}
