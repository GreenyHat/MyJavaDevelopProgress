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
    
    /*In the beginning, the resolution of the exercise was a disaster,
    I went directly to code without thinking about the algorithm or the different phases. 
                                    SPOILER:
      IT'S NEVER A GOOD IDEA... LESSON LEARNED: THINK 1 HOUR PROGRAM 10 MINUTES
    */
    
    
    
     public static void main(String[] args){ 
         
    Float heigh=0.0f, heighSum=0.0f, media=0.0f, max = 0.0f, less = 3.0f;
    int counter = 0, members=0, console;
    Scanner scKey = new Scanner (System.in);

    do{
        System.out.println("Whats your intention?: \n" + 
           "0. Exit\n" + 
           "1. Introduce info: \n"+
           "2. Show me the average \n"+
           "3. Show me the bigger heigh \n" + 
           "4. Show me the smaller heigh");
       console=scKey.nextInt();
       
    switch (console){

           

            
             case 0:

               System.out.println("You have left the program");
               break;
               
             case 1: 
        
                   
               System.out.println("Number of particimant: ");
               members = scKey.nextInt();
               counter++;
               
               System.out.println("Heigh: ");
               heigh = scKey.nextFloat();   
               heighSum+=heigh;
           
               
               
               
               
                              
                 if (heigh > max) {
                     max=heigh;
                     }
                     
                     
                  if (heigh < less) {
                    less = heigh ;//no me devuelve el MENOR, SINO EL ULTIMO MENOR INTRODUCIDO
                    }break;
           
              case 2:
                  
             

              
             media= heighSum/(counter);
             
             System.out.print("This is the average: " + media + "\n");
             
             break;
             
               case 3: 

              

                 System.out.println("The max heigh is: " + max+ "\n") ;
                 break;

            

               
               case 4:
            
                
                 System.out.println("The minimum heigh is: " + less + "\n"); 
                 break;
        }
    
            }while(console != 0);
                      
        
          
     
        
    }
}
    



        
       
     
