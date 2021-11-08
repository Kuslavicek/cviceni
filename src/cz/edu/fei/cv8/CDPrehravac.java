package cz.edu.fei.cv8;

public class CDPrehravac {
    private CD vlozeneCD;
    private int aktualniZaznamIndexu;

    CDPrehravac(CD vlozeneCD, int aktualniZaznamIndexu) {
        this.vlozeneCD = vlozeneCD;
        this.aktualniZaznamIndexu = aktualniZaznamIndexu;
    }
    public void vlozCD(CD cd){
        if(vlozeneCD==null) {
            vlozeneCD = cd;
        }else{
            System.out.println("CD je již vloženo");
        }
    }
    public void vyjmiCD(){
        if(vlozeneCD!=null){
            System.out.println(vlozeneCD.toString());
            vlozeneCD=null;
            System.out.println("CD vyjmuto");
        }
        else{
            System.out.println("Není vloženo CD");
        }
    }
    public void vypisAktualniZaznam(){
        if(vlozeneCD!=null){
            System.out.println("Aktuální záznam: "+vlozeneCD.dejZaznam(aktualniZaznamIndexu));
        }
        else{
            System.out.println("Není vloženo CD");
        }
    }
    public void predchoziZaznam(){
        if(vlozeneCD!=null){
            if(aktualniZaznamIndexu==0){
                aktualniZaznamIndexu= vlozeneCD.dejPocetZaznamu()-1;
            }else{
                aktualniZaznamIndexu--;
            }
        }
        else{
            System.out.println("Není vloženo CD");
        }
    }
    public void dalsiZaznam(){
        if(vlozeneCD!=null){
            if(aktualniZaznamIndexu >= vlozeneCD.dejPocetZaznamu()-1){
                aktualniZaznamIndexu = 0;
            }
            else{
                aktualniZaznamIndexu++;
            }
        }
        else{
            System.out.println("Není vloženo CD");
        }
    }
}
