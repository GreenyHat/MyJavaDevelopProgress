package myjavadevelopprogress.pildoras_informaticas;

import java.util.Scanner;

public class Ex_11_SimpleValueCounter {
    /**
         * 10 num in console
         * positive or negative?
         * store and separate
         * the mean of the pairs
         */

    public static void main(String[] args) {
        byte [] numStore = new byte[10];
        byte invertCounter = 10, positiveCounter = 0, negativeCounter = 0, media = 0, mediaCounter = 0;
        double finalMedia = 0.0;
        Scanner scKey = new Scanner(System.in);            

        
        for (int i = 0; i < numStore.length; i++) {
                System.out.println("NEGATIVE COUNTER: "+negativeCounter);
                System.out.println("POSITIVE COUNTER: "+positiveCounter);
                System.out.println("Write an integer number " + invertCounter + " times: \n");
                numStore[i] = scKey.nextByte();
                invertCounter--;

                if (numStore[i]<0) {
                    negativeCounter++;

                }else{
                    positiveCounter++;
                }
                    
                if (numStore[i]%2==0) {
                    media += numStore[i]; 
                    mediaCounter++; 
                }
            }    finalMedia  = (double) media/mediaCounter;     
        System.out.println("The mean of the pairs is: " + finalMedia);
        scKey.close();
    }
}
