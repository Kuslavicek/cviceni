package cz.edu.fei.cv5;

public class Cv3 {

    public static int[] bubble_sort(int[] pole) {
         for (int j=0;j<pole.length;j++){
            for (int i = 1; i < pole.length; i++) {
                if (pole[i] < pole[i - 1]) {
                    int pom = pole[i];
                    pole[i] = pole[i - 1];
                    pole[i - 1] = pom;
                } else {
                    continue;
                }
            }
        }
            return pole;
        }

    public static void main(String[] args) {

        // TODO vytvorte pole o velikosti 10 s nahodnymi cisly 0-10
        // vytvorte metodu setrid, ktera seradi prvky pole vzestupne
        // napr: {5, 6, 7 ,3 } -> {3, 5, 6, 7}
        // muzete vyuzit napr algoritmu bubble sort
        int [] pole1 = new int[10];
        for(int i=1;i<=10;i++){
            pole1[i-1] = (int) (Math.random()*10)+1;
        }
        for(int i=0;i<10;i++){
            System.out.print(pole1[i]+" ");
        }
        pole1=bubble_sort(pole1);
        System.out.println();
        System.out.println("Seřazené pole: ");
        for(int i=0;i<10;i++){
            System.out.print(pole1[i]+" ");
        }
    }
}
