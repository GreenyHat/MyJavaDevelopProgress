package myjavadevelopprogress.pildoras_informaticas.POO;

import javax.swing.JOptionPane;

public class Ex_8_media_13_ATS {
    
public static void main(String[] args) {
    int number, positives = 0, negatives = 0, zeroCount = 0;
    int panel = Integer.parseInt(JOptionPane.showInputDialog("give me ten numbers:"));


do {

    for (int numbers = 0; numbers < 10; numbers++) {
       if (panel>0) {
        positives++;
       }else if (panel==0) {
        zeroCount++;
       }else{
         negatives++;
       }
       System.out.println("La media de los positivos es : ");
    }

} while (panel<=10);


   
    }
    

}


