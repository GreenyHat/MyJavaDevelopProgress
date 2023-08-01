package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class Ex_14_ATS_checking_array {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean incre = false, decre = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me number for the list: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print((i + 1) + ". Enter a number:");
            array[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < array.length-1; j++) {

            if (array[j] < array[j + 1]) {
                incre = true;
            }
        }

        for (int i = 0; i < array.length-1; i++) {

            if (array[i] > array[i + 1]) {
                decre = true;
            }
        }

        if (incre && !decre) {
            System.out.println("\nThe order is ascending");
        } else if (decre && !incre) {
            System.out.println("\nThe order is descendant");
        } else if (incre && decre) {
            System.out.println("\n The numbers are messy");
        } else{
            System.out.println("\nThe numbers entered are the same");
        }

    }
}
