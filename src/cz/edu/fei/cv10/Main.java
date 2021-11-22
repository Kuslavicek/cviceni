package cz.edu.fei.cv10;

public class Main {
    public static void main(String[] args) {
        Manazer manazer1 = new Manazer("Pepa", 45000, "Danone");
        Manazer manazer2 = new Manazer("Tomáš", 50000, "Avast");
        Manazer manazer3 = new Manazer("Radek", 47000, "ČSOB");
        Programator programator1 = new Programator("Petr", 60000, "C++");
        Programator programator2 = new Programator("Bedřich",55000, "Java");
        Programator programator3 = new Programator("Cyril", 57000, "Python");
        Programator[] programatori = {programator1, programator2, programator3};
        Manazer[] manazeri = {manazer1, manazer2, manazer3};

        for (Manazer i: manazeri) {
            i.predstavSe();
            i.pracuj();
            i.odpocivej();
            System.out.println(i);

        }
        for (Programator i: programatori) {
            i.predstavSe();
            i.pracuj();
            i.odpocivej();
            System.out.println(i);

        }
    }


}
