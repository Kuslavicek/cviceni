package cz.edu.fei.cv7;
import java.util.regex.Pattern;

public class ValidatorTextu {
    String vzor;

    ValidatorTextu(String vzor) {
        this.vzor = vzor;
    }

    public boolean validuj(String hodnota) {
        return Pattern.matches(vzor, hodnota);
    }
    @Override
    public String toString(){
         return vzor;
        }
    }
