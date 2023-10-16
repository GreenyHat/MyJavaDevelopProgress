package Project67;

import java.util.Scanner;

public class ArrayForCalculate {

    private int[] arr;
    private Scanner sc;
    private int counter, fiftyCounter, sum;

    public void loadElement() {
        sc = new Scanner(System.in);
        arr = new int[8];

        System.out.println("Enter eight numbers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }sc.close();
    }

    public void showElement() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 36) {
                counter += arr[i];
            } if (arr[i] > 50) {
                fiftyCounter++;
            }
        }
        System.out.println("The acumulate value of all numbers is: " + sum);
        System.out.println("The elements bigger than 36 add up to: " + counter);
        System.out.println("The elements bigger than 50 are: " + fiftyCounter);


    }

    public static void main(String[] args) {
        ArrayForCalculate arr = new ArrayForCalculate();

        arr.loadElement();
        arr.showElement();
    }

}
