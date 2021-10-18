package cz.edu.fei.cv5;

public class Cv2 {

    public static boolean vloz(int prvek, int x, int y, int [][] pole) {
        // TODO vlozi do pole prvek na pozici x, y 
        // zkontroluj, zda se nevklada mimo rozsah pole
        // navratova hodnota = uspesnost vkladani
        
        //Priklad:
        //vypis(pole)
        // 1    2   3
        // 4    5   6
        // 7    8   9
        // vloz(45, 1 , 1, pole) 
        //vypis(pole)
        // 1    2   3
        // 4    42  6
        // 7    8   9               
        boolean vlozeno=false;
        pole[x][y]=prvek;
        if(pole[x][y]==prvek){
            vlozeno=true;
        }else{
            vlozeno=false;
        }
        return vlozeno;
    }
    
    public static void vypis(int [][] pole) {
        // vypise 2D pole do konzole
        
        //Priklad:
        //vypis(pole)
        // 1    2   3
        // 4    5   6
        // 7    8   9
        for(int i=0;i<pole.length;i++){
            for(int j=0;j<pole.length;j++){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int [][] inicializace(int velikost) {
        int[][] pole = new int[velikost][velikost];
        // TODO vytvořte pole jako symetricke 2D pole
        // naplnte hodnotami násobků čísel

        // Priklad stavu po inicializaci:
        //pole = inicializace(3)
        //vypis(pole)
        // 1    2   3
        // 2    4   8
        // 3    6   9
        for(int i=0;i<velikost;i++){
            pole[i][0]=i+1;
            pole[0][i]=i+1;
        }


        for (int i = 1; i < velikost; i++) {
            for (int j = 1; j < velikost; j++) {
                pole[i][j] = pole[0][i]*pole[j][0];
            }
        }
        return pole;
    }
    

    public static void main(String[] args) {
        // Implementujte operace nad 2D polem viz. popis u metod 
        
        // Inicializujte 2D pole, vypiste, upravte stav pomoci operace vloz(), vypiste
        int[][] pole1=inicializace(5);
        vypis(pole1);
        vloz(35,1,0,pole1);
        vypis(pole1);

        
        
        
    }
}
