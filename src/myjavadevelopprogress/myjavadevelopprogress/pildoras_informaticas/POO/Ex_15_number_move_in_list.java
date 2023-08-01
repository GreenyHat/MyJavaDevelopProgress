package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class Ex_15_number_move_in_list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];
        int lastNumber;

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Enter the number: ");
            list[i] = sc.nextInt();
        }
        sc.close();
        lastNumber = list[9];

        for (int i = 8; i >= 0; i--) {
            list[i + 1] = list[i];
        }

        list[0] = lastNumber;

        System.out.print("Final list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("\n" + (i + 1) + ". " + list[i]);
        }
    }
}
