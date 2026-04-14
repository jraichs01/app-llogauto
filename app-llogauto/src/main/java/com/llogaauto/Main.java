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
            System.out.println("1. Afegir Automobil");
            System.out.println("2. Llistar Vehicles");
            System.out.println("3. Sortir");
            System.out.print("Tria una opció: ");

            int opcio = sc.nextInt();
            sc.nextLine();

            // Verifiquem si l'array està ple abans d'afegir-ne un de nou
            if ((opcio == 1 || opcio == 2) && comptador >= agencia.getNumCotxes()) {
                System.out.println("❌ Error: La flota està plena (màxim 10).");
                continue; // Torna a l'inici del bucle
            }

            switch (opcio) {
                case 1:
                    System.out.print("Marca: ");
                    String mc = sc.nextLine();
                    System.out.print("Model: ");
                    String modc = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matc = sc.nextLine();

                    // Creem un atomobil i Inserim a la posició del comptador i després
                    // l'incrementem
                    Automobil auto = new Automobil(mc, modc, matc);
                    agencia.afegirAutomobil(comptador, auto);
                    comptador++;
                    break;

                case 2:
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
}
