package cz.edu.fei.cv8;

import java.util.Arrays;

public class CD {
    private String nazev;
    private Zaznam[] zaznamy;

    CD(String nazev, Zaznam[] zaznamy){
        this.nazev=nazev;
        this.zaznamy=zaznamy;
    }
    @Override
    public String toString() {
        return "CD{" +
                "nazev='" + nazev + '\'' +
                ", zaznamy=" + Arrays.toString(zaznamy) +
                '}';
    }
    public int dejPocetZaznamu(){
        return zaznamy.length;
    }
    public Zaznam dejZaznam(int index){
        if(index<0 || index>=zaznamy.length){
            return null;
        }
        else{
            return zaznamy[index];
        }
    }

}
