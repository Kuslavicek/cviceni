package cz.edu.fei.cv10;

public abstract class Zamestnanec {
    protected String jmeno;
    protected double plat;
    Zamestnanec(String jmeno, double plat){
        this.jmeno=jmeno;
        this.plat=plat;
    }
    abstract void pracuj();
    abstract void odpocivej();

    void predstavSe(){
        System.out.println("Ahoj, jmenuji se "+jmeno+", a můj plat je: "+plat);
    }
    @Override
    public String toString() {
        return "Zamestnanec{" +
                "jmeno='" + jmeno + '\'' +
                ", plat=" + plat +
                '}';
    }
}
