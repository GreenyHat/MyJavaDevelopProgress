package myjavadevelopprogress.pildoras_informaticas.POO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author greeny
 */
 /////////////////////AN ABSURD MODEL FOR THE HOROSCOPE/////////////////////////

public class Ex_3 {
    
public static void main(String[] args){  
    int dayBorn, monthBorn;
    String stupidHoroscope = null;
    
    Scanner scKey = new Scanner(System.in);
    
    System.out.println("What day were you born?");    
    dayBorn = scKey.nextInt();
    System.out.println("and what month?, please introduce one or two numbers, my level of programming does not allow me another solution ");
    monthBorn = scKey.nextInt();
    scKey.close();
    ///////////ARIES////////////////
    
    if (dayBorn >=21 && dayBorn <= 31 && monthBorn == 3 ) {
        stupidHoroscope = "Your horoscope is Aries";
        System.out.println(stupidHoroscope);
    }
    
    
     else if (dayBorn<=20&&monthBorn==4) {
        stupidHoroscope="Your horoscope is Aries";
          System.out.println(stupidHoroscope);
     }
                
///////////////////////////////////////////////////////////

      if (dayBorn >=21 && dayBorn<=28&&monthBorn==4) {
     stupidHoroscope = "Your horoscope is Tauro";
          System.out.println(stupidHoroscope);
             
             }
      else if (dayBorn >=21 && dayBorn <= 31 && monthBorn == 5) {
        stupidHoroscope = "Your horoscope is Tauro";
        System.out.println(stupidHoroscope);
        
    }
   
}
}


