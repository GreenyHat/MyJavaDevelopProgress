package myjavadevelopprogress;

import java.util.Scanner;

public class Ex_5_DNI {
    public static void main(String[] args) {

        final char[] DNI_LETTERS = { 'T', 'E', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S','Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        int dni = 0, letterCalc = 0;
        Scanner scKey = new Scanner(System.in);

        System.out.println("Whats your dni number?");
        dni = scKey.nextInt();
        letterCalc = dni % 23;
        System.out.println("Your dni letter is: " + DNI_LETTERS[letterCalc]);
        scKey.close();

    }
}
