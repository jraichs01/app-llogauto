package com.llogaauto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creem l'agencia de lloguer
        GestorAutomobils agencia = new GestorAutomobils(10);
        menu(agencia);
    }

    // MENU
    public static void menu(GestorAutomobils agencia) {

        Scanner sc = new Scanner(System.in);

        // 1. Definim una mida màxima i l'array
        int comptador = 0; // Ens indica quants vehicles hi ha i la següent posició lliure

        boolean sortir = false;

        while (!sortir) {
            System.out.println("\n--- GESTIÓ DE FLOTA (ARRAY FIXE) ---");
            System.out.println("1. Afegir Cotxe");
            System.out.println("2. Afegit Camió:");
            System.out.println("3. Llistar Vehicles");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");

            int opcio = sc.nextInt();
            sc.nextLine();

            // Verifiquem si l'array està ple abans d'afegir-ne un de nou
            if ((opcio == 1 || opcio == 2) && comptador >= agencia.getNumAutos()) {
                System.out.println("❌ Error: La flota està plena (màxim 10).");
                continue; // Torna a l'inici del bucle
            }

            switch (opcio) {
                case 1:
                    // Afegim un cotxe
                    agencia.afegirAutomobil(Automobil.getComptador(),crearCotxe(sc));
                    break;
                case 2:
                    // Afegim un camió
                    agencia.afegirAutomobil(Automobil.getComptador(),crearCamio(sc));
                    break;
                case 3:
                    // Llistar autos
                    agencia.llistarAutomobils();
                    break;

                case 4:
                    sortir = true;
                    break;

                default:
                    System.out.println("Opció no vàlida.");
            }
        }

        sc.close(); // tanquem Scanner
        System.out.println("Programa finalitzat.");
    }

    private static Cotxe crearCotxe(Scanner sc){
        String matricula = "";

        System.out.print("Marca: ");
        String mc = sc.nextLine();
        System.out.print("Model: ");
        String modc = sc.nextLine();
        
        System.out.print("Matrícula: ");
        while (Automobil.validarMatricula(matricula) == false){
            matricula = sc.nextLine();
            if(Automobil.validarMatricula(matricula)==false){
                System.out.print("Matricula incorrecta!! Matrícula: ");
            } else{
                break;
            }
        }
       
        System.out.print("Numero de portes: ");
        int nump = Integer.parseInt(sc.nextLine());
        TipusCombustible tcombustible = seleccionarCombustible(sc);
        
        Cotxe cotxe = new Cotxe(mc, modc, matricula, tcombustible, nump);
        return cotxe;
    }

    private static Camio crearCamio(Scanner sc){
        String matricula = "";

        System.out.print("Marca: ");
        String mc = sc.nextLine();
        System.out.print("Model: ");
        String modc = sc.nextLine();

        System.out.print("Matrícula: ");
        while (Automobil.validarMatricula(matricula) == false){
            matricula = sc.nextLine();
            if(Automobil.validarMatricula(matricula)==false){
                System.out.print("Matricula incorrecta!! Matrícula: ");
            } else{
                break;
            }
        } 
   
        System.out.print("Tara: ");
        Float tara = Float.parseFloat(sc.nextLine());
        System.out.print("Pes Màxim: ");
        Float pesMaxim = Float.parseFloat(sc.nextLine());
        TipusCombustible tcombustible = seleccionarCombustible(sc);
        
        Camio camio = new Camio(mc, modc, matricula,tcombustible,tara,pesMaxim);
        return camio;
    }

    private static TipusCombustible seleccionarCombustible(Scanner sc) {
        System.out.println("Tria el combustible:");
        TipusCombustible[] valors = TipusCombustible.values();
        for (int i = 0; i < valors.length; i++) {
            System.out.println(i + ". " + valors[i]);
        }
        int tria = sc.nextInt();
        return valors[tria];
    }

}
