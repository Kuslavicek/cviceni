package cz.edu.fei.cv8;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Zaznam zaznam1 = new Zaznam("Nazev_1", "Autor_1", "Druh_1");
        Zaznam zaznam2 = new Zaznam("Nazev_2", "Autor_2", "Druh_2");
        System.out.println(zaznam1);
        Zaznam zaznam3 = new Zaznam("Nazev_3", "Autor_3", "Druh_3");
        Zaznam zaznam4 = new Zaznam("Nazev_4", "Autor_4", "Druh_4");
        CD cd1= new CD("cd_1", new Zaznam[]{zaznam1, zaznam2, zaznam3});
        CD cd2= new CD("cd_1", new Zaznam[]{zaznam3, zaznam4});
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd1.dejPocetZaznamu());
        System.out.println(cd2.dejZaznam(0));

        CDPrehravac prehravac1 = new CDPrehravac(cd1, 0);
        prehravac1.predchoziZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.dalsiZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.dalsiZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.dalsiZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.dalsiZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.dalsiZaznam();
        prehravac1.vypisAktualniZaznam();
        prehravac1.vyjmiCD();
        prehravac1.vlozCD(cd2);
        prehravac1.vypisAktualniZaznam();
    }
}