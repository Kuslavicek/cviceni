package cz.edu.fei.cv6;

public class Cv1 {

    // Implementujte třídu Kruh, v této třídě vytvořte jeho instanci a zavolejte metodu toString()
    // Trida Kruh bude obsahovat:

    // atributy
    // double polomer

    // konstruktor
    // bude přijímat jako parametr polomer a ukladat si ho jako atribut

    // funkce 
    //double dejObvod() - bude vracet obvod kruhu
    //double dejObsah() - bude vracet obsah kruhu
    //String toString() - Vypíše informace o kruhu - jeho polomer, obvod a obsah
    public static void main(String[] args) {
        Kruh k = new Kruh(6);
        System.out.println(k.toString());
    }
}
