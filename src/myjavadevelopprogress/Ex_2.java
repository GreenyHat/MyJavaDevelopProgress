/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavadevelopprogress;

import java.util.Scanner;

/**
 *
 * @author Greeny
 */
public class Ex_2 {
    ////////////////////*COFFE SHOP:*////////////////////////
    
public static void main(String[] args){   
    int coffeNum, toastNum, juiceNum;
    double coffePrize = 1.1, toastPrize = 1.5, juicePrize = 2, cuenta = 0;
    Scanner scKey = new Scanner(System.in);
  
    System.out.println("How many coffees are you going to drink?");
    coffeNum = scKey.nextInt();
    
   System.out.println("How many toasts?");
   toastNum = scKey.nextInt();
    
   System.out.println("Any juice?");
   juiceNum = scKey.nextInt();
   
   cuenta = (coffePrize*coffeNum) + (juiceNum*juicePrize) + (toastNum*toastPrize);
   System.out.println("Well, the account would be: " + cuenta + "$");
    
   
    
    
}

}