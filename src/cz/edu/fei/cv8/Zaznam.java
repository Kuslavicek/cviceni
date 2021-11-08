package cz.edu.fei.cv8;

public class Zaznam {
    private String nazev;
    private String autor;
    private String druh;
    Zaznam(String nazev, String autor, String druh){
        this.nazev=nazev;
        this.autor=autor;
        this.druh=druh;
    }

    @Override
    public String toString(){
        return "Zaznam nazev: "+nazev+" autor: "+autor+" druh: "+druh;
    }
}
