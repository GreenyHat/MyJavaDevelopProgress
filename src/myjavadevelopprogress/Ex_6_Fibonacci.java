package myjavadevelopprogress;

import java.util.Scanner;


public class Ex_6_Fibonacci {
    public static void main(String[] args) {
        
        Scanner scKey = new Scanner(System.in);
        byte nFirstNumbers = 0, aux = 0, aux2 = 1, glass = 0;

        System.out.println("Choose a number to limit the sequence(12 is the limit cause I've used byte like variable): ");
        nFirstNumbers = scKey.nextByte();
        scKey.close();

        for (int i = 0; i < nFirstNumbers; i++) {
           
            glass = aux;
            aux=aux2;
            aux2=(byte)(glass+aux2); 
            System.out.println(glass);     
        }
        



    }
}
