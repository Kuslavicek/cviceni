package cz.edu.fei.cv6;

public class SpravcePole {
    int[] pole;

    SpravcePole(int delkaPole) {
        pole = new int[delkaPole];
        for (int i = 0; i < delkaPole; i++) {
            pole[i] = (int) (Math.random() * 100) + 0;
        }
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
        }
        return max;
    }

    public int min() {
        int min = 10;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < min) {
                min = pole[i];
            }
        }
        return min;

    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < pole.length; i++) {
            suma = suma + pole[i];
        }
        return suma;
    }

    public double prumer() {
        return suma() / pole.length;
    }

    public String toString() {
        String text = "";
        for (int i = 0; i < pole.length; i++) {
            text = text + pole[i] + " ";
        }
        return text;
    }

}
