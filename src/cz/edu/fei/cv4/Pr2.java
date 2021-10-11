package cz.edu.fei.cv4;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        int nahodneCislo = (int) (Math.random() * 100) + 1;
        System.out.println(nahodneCislo);
        System.out.print("Hádej číslo 1-100: ");
        int hadaneCislo = vstup.nextInt();
        int pocitadlo=0;
        int limit = 5;
        String ne="U";
        while ((hadaneCislo != nahodneCislo)||(pocitadlo!=limit)) {
            if (hadaneCislo < nahodneCislo) {
                System.out.print("Zkus větší číslo: ");
            } else {
                System.out.print("Zkus menší číslo: ");
            }
            if(pocitadlo==limit){
                System.out.println("Prohra");
                ne="Neu";
                break;
            }
            hadaneCislo = vstup.nextInt();
            pocitadlo++;

        }

        System.out.println(ne+"uhodl jste číslo");
        System.out.println("Na " + pocitadlo + ". pokus");




    }
    // přidat počítadlo pokusů, aby se na konci šlo vypsat na kolikátý pokus
    // přidat ukončení hry neúspěchem, pokud to nestihne za nějaký počet pokusů
}
