/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavadevelopprogress;

/**
 *
 * @author Greeny
 */
import java.util.Scanner;

public class Ex_4_extra {
     public static void main(String[] args){ 
         
    double heigh=0.0, heighSum=0.0, media=0.0, max = 0.0, less;
    int counter = 0, members=0, console;
    Scanner scKey = new Scanner (System.in);

   System.out.println("Whats your intention?: \n" + 
           "0. Exit\n" + 
           "1. Introduce info: \n"+
           "2. Show me the average \n"+
           "3. Show me the bigger heigh \n" + 
           "4. Show me the smaller heigh");
       console=scKey.nextInt();
       
    switch (console){
           
           case 0:
               System.out.println("Bye!");
               break;
               
           case 1: 
               do{
                   
               System.out.println("Number of particimant (press 0 twice if you want to go back to the menu) : ");
               members = scKey.nextInt();
               counter++;
               
               System.out.println("Heigh: ");
               heigh = scKey.nextDouble();
               heighSum+=heigh;
               
                   if (max<heigh) {
                       max = heigh;
                   }
              
            
               }
               while(members > 0);
              
                     
         
           System.out.println("Whats your intention?: \n" + 
           "0. Exit\n" + 
           "1. Introduce info: \n"+
           "2. Show me the average \n"+
           "3. Show me the bigger heigh \n" + 
           "4. Show me the smaller heigh");
            console=scKey.nextInt();
            
        switch (console){
            
           case 2:
              
             media= heighSum/(counter-1);
             
             System.out.print("This is the average: " + media);
             
             System.out.println("Whats your intention?: \n" + 
           "0. Exit\n" + 
           "1. Introduce info: \n"+
           "2. Show me the average \n"+
           "3. Show me the bigger heigh \n" + 
           "4. Show me the smaller heigh");
            console=scKey.nextInt();
            
        
            
            
           case 3: 
               
            System.out.println("The max heigh is: " + max);
               
       
                            
        }
    }
}

}
        
       
     
