package myjavadevelopprogress.pildoras_informaticas.POO;

import javax.swing.JOptionPane;

public class Ex_9_ATS_edad {
    public static void main(String[] args) {

        int age, sumAge = 0, ageBigger18 = 0, heightBigger175 = 0;
        float height, heightMedia, ageMedia, sumHeight = 0;

        for (int i = 0; i < 5; i++) {
            age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
            height = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu estatura: "));
            sumAge += age;
            sumHeight += height;

            if (age >= 18) {
                ageBigger18++;
            }
            if (height > 1.75) {
                heightBigger175++;
            }

        }
        ageMedia = (float) sumAge / 5;
        heightMedia = (float) sumHeight / 5;
        System.out.println("La media de edad es: " + ageMedia + ". Y la estatura promedio es: " + heightMedia
                + ". Por otro lado, la cantidad de mayores de edad es de: " + ageBigger18 + " elementos"
                + ". Mientras que la cantidad de chicos que miden mas de 1.75 es de " + heightBigger175);

    }
}
