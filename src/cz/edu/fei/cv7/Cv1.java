package cz.edu.fei.cv7;

public class Cv1 {
    // Implementujte třídu Kostka, v této třídě vytvořte jeji instanci, zavolejte metodu hodKostkou a zavolejte metodu toString()
    // Trida Kostka bude obsahovat:

    // atributy
    // int pocetSten

    // konstruktor
    // bude přijímat jako parametr pocetSten a ukladat si ho jako atribut

    // funkce
    //double hodKostkou() - bude vracet výsledek hodu kostkou (využijte random)
    //String toString() - Vypíše informace o kostkce - pocetSten

    public static void main(String[] args) {
        Kostka kostka1 = new Kostka(6);
        System.out.println(kostka1.hodKostkou());
        System.out.println(kostka1.toString());
    }
}
