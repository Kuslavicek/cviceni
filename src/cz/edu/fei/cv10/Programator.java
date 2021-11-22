package cz.edu.fei.cv10;

public class Programator extends Zamestnanec{
    private String jazyk;
    public Programator(String jmeno, double plat, String jazyk) {
        super(jmeno, plat);
        this.jazyk=jazyk;
    }
    public void pracuj(){
        System.out.println("Programátor "+jmeno+" programuje v jazyce "+jazyk);
    }
    public void odpocivej(){
        System.out.println("Programátor "+jmeno+" odpočívá");
    }

    @Override
    public String toString() {
        return "Programator{" +"jmeno='" + jmeno + '\'' +
                ", plat=" + plat +
                " jazyk='" + jazyk + '\'' +
                '}';
    }
}
