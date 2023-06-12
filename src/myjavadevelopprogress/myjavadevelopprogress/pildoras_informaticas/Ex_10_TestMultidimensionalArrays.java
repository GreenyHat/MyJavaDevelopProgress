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


        System.out.println("Por otro lado:");

        //Recorrido de un array solo numeros impares:

        int [] arrayTest = new int[40];

        for (int i = 0; i < arrayTest.length; i++) {

            if (i%2!=0) {
                arrayTest[i]=i;
                System.out.println(i);
            }

        }

    }
}
