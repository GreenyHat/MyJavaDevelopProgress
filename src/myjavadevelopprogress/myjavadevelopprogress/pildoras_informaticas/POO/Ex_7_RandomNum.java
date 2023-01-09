package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;


public class Ex_7_RandomNum {
    
    public static void main(String[] args) {
        
        byte randomNum, userNum, failCounter=0;
        Scanner scKEy = new Scanner(System.in);
        boolean correctNum = false;
      
        System.out.println( "Try to guess what number I'm thinking between one and nine: ");
        userNum = scKEy.nextByte();
        randomNum=(byte)Math.floor(Math.random()*9+1);

        for (failCounter = 0; failCounter < 3 && !correctNum ; failCounter++) {

            if (randomNum<userNum) {
                System.out.println("Try a smaller number!");
                userNum=scKEy.nextByte();       
            }
            else if (randomNum>userNum) {
                System.out.println("Try a higher number!");  
                userNum=scKEy.nextByte();
             

            }else{
                correctNum=true;
                System.out.println("Congratulations!! It's the correct number! ");
                scKEy.close();
            }
              
        }
        System.out.println("Your results are: " + (correctNum && failCounter<=3) != null? "You have won":"you have lost");
     
    }
}
