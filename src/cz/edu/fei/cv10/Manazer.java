package cz.edu.fei.cv10;

public class Manazer extends Zamestnanec{
    private String firma;
    public Manazer(String jmeno, double plat, String firma) {
        super(jmeno, plat);
        this.firma=firma;
    }
    public void pracuj(){
        System.out.println("Manažer "+ jmeno+" pracuje ve firmě "+firma);
    }
    public void odpocivej(){
        System.out.println("Manažer "+jmeno+" odpočívá");
    }

    @Override
    public String toString() {
        return "Manazer{" +"jmeno='" + jmeno + '\'' +
                ", plat=" + plat +
                " firma='" + firma + '\'' +
                '}';
    }
}
