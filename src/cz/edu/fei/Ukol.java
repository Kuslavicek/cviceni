package cz.edu.fei;

import java.util.Scanner;

public class Ukol {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("zadej jmeno:");
        String jmeno = vstup.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = vstup.nextLine();

        System.out.println(jmeno + " " + prijmeni);

        System.out.println("Zadej cislo");
        int číslo = vstup.nextInt();
        if (číslo > 0) {
            System.out.println("číslo je kladné");
        } else if (číslo < 0) {
            System.out.println("číslo ja záporné");
        } else {
            System.out.println("Číslo je nula");
        }

        System.out.println("Zadej tři čísla");
        int cislo1 = vstup.nextInt();
        int cislo2 = vstup.nextInt();
        int cislo3 = vstup.nextInt();
        if (cislo2 > cislo1 && cislo2 > cislo3) {
            System.out.println("Druhé číslo je největší");
        } else if ((cislo2 > cislo1 && cislo2 < cislo3) || (cislo1 > cislo2 && cislo2 < cislo3)) {
            System.out.println("Třetí číslo je největší");
        } else {
            System.out.println("První číslo je největší");
        }

    }
}
