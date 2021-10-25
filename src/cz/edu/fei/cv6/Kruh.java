package cz.edu.fei.cv6;

public class Kruh {
    double polomer;
    Kruh(double polomer){
    this.polomer=polomer;
    }
    public double dejObvod(){
        return polomer*2*Math.PI;
    }
    public double dejObsah(){
        return polomer*polomer*Math.PI;
    }
    public String toString(){
        double obsah=dejObsah();
        double obvod=dejObvod();
        return "Poloměr: "+polomer+" ,obsah: "+obsah+" ,obvod: "+obvod;
    }

}
