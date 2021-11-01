package cz.edu.fei.cv7;

public class Kostka {
    int pocetSten;
    Kostka(int pocetSten){
        this.pocetSten=pocetSten;
    }
    public int hodKostkou(){
        return (int) (Math.random()*pocetSten)+1;
    }
    public String toString(){
        return("Tato kostka má "+pocetSten+" stěn");
    }
}
