package myjavadevelopprogress.pildoras_informaticas;

public class Ex_10_TestMultidimensionalArrays {
    
    public static void main(String[] args) {

        int [] [] multiArray = {{2,-2, 6, 8},
                                {3, 7, 9, 10},
                                {3, 35, -80, 90}};

        for (int i = 0; i < multiArray.length; i++) {

            for (int j = 0; j < multiArray[i].length; j++) {//Por que al poner i funciona bien?
                System.out.print(multiArray[i][j]+ " ");
            }
            System.out.println();
        }


        
    }
}
