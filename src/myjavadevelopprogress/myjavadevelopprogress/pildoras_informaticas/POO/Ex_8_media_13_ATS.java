package myjavadevelopprogress.pildoras_informaticas.POO;

import javax.swing.JOptionPane;

public class Ex_8_media_13_ATS {

    public static void main(String[] args) {
        int number, posCounter = 0, negCounter = 0, zeroCount = 0, sumPositives = 0, sumNegatives = 0;
        float positiveAvg, negativeAvg;

        for (int i = 0; i <= 10; i++) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Give me a number:"));

            if (number == 0) {
                zeroCount++;
            }else if (number>0) {
                posCounter++;
                sumPositives=+number;
            }else{
                negCounter++;
                sumNegatives=+number;
            }

            // public class Error { // Dentro error
            //      if (number > 0) {
            //     sumPositives=+i;
            //     posCounter++;
            //     number = sumNegatives/posCounter;
               
            // } else if (i == 0) {
            //     zeroCount++;
               

            // } else {
            //     negCounter=+i;
            //     negCounter++;
            //     number = sumPositives/negCounter;
                

            // }
            // }

            // }
            
        }

        //Tratando con los positivos
        if (posCounter==0) {
            System.out.println("Cannot be extracted the averange");
        }else{
            positiveAvg = (float) sumPositives/posCounter;
            System.out.println("The averange of the positives numbers is: " + positiveAvg);
        }
        //Negativos
        if (negCounter==0) {
            System.out.println("Cannot be extracted the averange");
        }else{
            negativeAvg = (float) sumNegatives/negCounter;
            System.out.println("The averange of the positives numbers is: " + negativeAvg);
        }
        //Cero
        if (zeroCount==0) {
            System.out.println("There is not zeros");
        }else{
            System.out.println("There are " + zeroCount + " zeros");
        }
        

    }

}
