package cz.edu.fei;
import java.util.Scanner;

public class Teplota {
    public static void main(String[] args) {
        final int maxTeplota=29;
        Scanner vstup = new Scanner(System.in);
        int teplota=vstup.nextInt();

        boolean value = true;
        if(teplota>maxTeplota){
            System.out.println("Překročena maximální teplota");
            System.out.println("Nastaveno na " +maxTeplota);
            teplota = maxTeplota;
        }else if(teplota<0){
            System.out.println("překročena minimální teplota");
            System.out.println("Nastaveno na 0");
            teplota=0;
        }else{
            System.out.println("Nastaveno na "+teplota+" stupň");
        }

    }
}
