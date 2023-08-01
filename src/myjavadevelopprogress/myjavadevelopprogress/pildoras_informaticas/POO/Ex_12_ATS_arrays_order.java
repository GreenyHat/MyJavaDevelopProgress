package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class Ex_12_ATS_arrays_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] numbers = new float[5];

        System.out.println("Saving data...");
        for (int i = 0; i < numbers.length; i++) {
        System.out.print((i+1) +". Enter a number: ");
        numbers[i] = sc.nextFloat();
        }

        System.out.println("With foreach:");
        for (float f : numbers) {
        System.out.println(f);
        }
        ////////// ORDEN INVERSO//////////
        float[] numbeers = new float[5];

        for (int i = 0; i < numbeers.length; i++) {
            System.out.print(i + 1 + ". Enter a number: ");
            numbeers[i] = sc.nextFloat();

        }
        sc.close();

        System.out.println("Outprinting...");
        for (int j = numbeers.length - 1; j >= 0; j--) {// Se pone j-1 porque los indices realmente siempre son
                                                        // length-1, por lo que si no pusiera length - 1 empezaria por
                                                        // el indice 5, el cual no existe.
            System.out.println(numbeers[j]);
        }

    }
}
