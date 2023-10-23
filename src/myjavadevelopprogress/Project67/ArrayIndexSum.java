package Project67;

import java.util.Scanner;
//25 minutos hay que mejorar los tiempos
public class ArrayIndexSum {
    private Scanner sc;
    private double[] arr;

    public void loadArray() {
        sc = new Scanner(System.in);
        int counter = 0;
        System.out.print("How much numbers are you going to sum? ");
        counter = sc.nextByte();
        arr = new double[counter];
        System.out.println("Enter the numbers for the operation: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

    }

    public void showOperation() {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.print("The result of the sum is: " + result);
    }

    public static void main(String[] args) {
        ArrayIndexSum arr = new ArrayIndexSum();
        arr.loadArray();
        arr.showOperation();
    }
}
