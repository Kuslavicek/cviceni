package cz.edu.fei.cv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.příklad
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte číslo:");
        int mesic = scan.nextInt();
        switch (mesic) {
            case 1:
                System.out.println("Leden");
                break;
            case 2:
                System.out.println("Únor");
                break;
            case 3:
                System.out.println("Březen");
                break;
            case 4:
                System.out.println("Duben");
                break;
            case 5:
                System.out.println("Květen");
                break;
            case 6:
                System.out.println("Červen");
                break;
            case 7:
                System.out.println("Červenec");
                break;
            case 8:
                System.out.println("Srpen");
                break;
            case 9:
                System.out.println("Září");
                break;
            case 10:
                System.out.println("Říjan");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Prosinec");
                break;
            default:
                System.out.println("Neplatná hodnota");
                break;
        }
        //2.příklad
        System.out.println("Zadejte číslo pro výpočet faktoriálu:");
        int cislo = scan.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= cislo; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Faktoriál " + cislo + " je " + faktorial);


        //3.příklad
        System.out.println("Zadejte dělence a dělitele:");
        int delenec = scan.nextInt();
        int delitel = scan.nextInt();
        int podil = delenec / delitel;
        System.out.println(delenec + " / " + delitel + " = " + podil);

        //4.priklad
        System.out.println("Zadejte 2 čísla pro NSD:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        do {
            int c=a;
            a=b;
            b=c%b;
        }
        while (b!=0);
        System.out.println("NSD je " + a);


    }

}


