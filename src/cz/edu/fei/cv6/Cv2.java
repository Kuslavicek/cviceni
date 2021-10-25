package cz.edu.fei.cv6;

public class Cv2 {
    // Vytvoři třídu SpravcePole
    // Třída bude obsahovat funkčnosti z minulého cvičení, příklad Cv1

    // atributy
        // int [] pole
    
    // konstruktor 
        // parametr - int delkaPole
        // na základe delkaPole, inicializuje promenou pole nahododnými cisly od 0-100
    // funkce (viz 5. cviceni Cv1)
        // int max()
        // int min()
        // int suma()
        // double prumer()
        // String toString() - vrátí String reprezentaci pole (vypis prvku).. napr "[2, 4, 8 , 9, 1]"
    public static void main(String[] args) {
        SpravcePole spravce1= new SpravcePole(7);
        System.out.println(spravce1.min());
        System.out.println(spravce1.max());
        System.out.println(spravce1.suma());
        System.out.println(spravce1.prumer());
        spravce1.toString1();
    }
}
