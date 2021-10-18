package cz.edu.fei.cv5;
public class Cv1 {

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int min(int[] array){
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
    public static int suma(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
            }
        return suma;
    }
    public static double prumer(int[] array){
        return suma(array)/array.length;
    }



    public static void main(String[] args) {
        // Vytvorte 1D pole1 o velikosti 10 s čísly 1-10
        // Vytvorte 1D pole2 o velikosti 10 s náhodnými čísli 0-10
        int[] pole1= new int[10];
        int[] pole2= new int[10];
        for(int i=1;i<=10;i++){
            pole1[i-1] = i;
            pole2[i-1] = (int) (Math.random()*10)+1;
        }

        // Vytvořte funkce zjistujici minimální hodnotu prvku v poli,
        // sumu a průměru prvků
        // Vypočítané hodnoty vypiště do konzole
        System.out.println("Maximalni prvek pole1: " + max(pole1));
        System.out.println("Maximalni prvek pole2: " + max(pole2));
        System.out.println("Minimální prvek pole1: " + min(pole1));
        System.out.println("Minimální prvek pole2: " + min(pole2));
        System.out.println("Suma pole1: " + suma(pole1));
        System.out.println("Suma pole2: " + suma(pole2));
        System.out.println("Průměr pole1: " + prumer(pole1));
        System.out.println("Průměr pole2: " + prumer(pole2));


    }
}
