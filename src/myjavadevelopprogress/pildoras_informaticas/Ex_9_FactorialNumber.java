package myjavadevelopprogress.pildoras_informaticas;

import javax.swing.JOptionPane;

public class Ex_9_FactorialNumber {
    public static void main(String[] args) {
               
        int num = Integer.parseInt(JOptionPane.showInputDialog("Give me a number: "));
        long factorial = num;

        for (int i = num-1; i > 0; i--) {//Para multiplicar hacia atrás hasta llegar a 1,
        // num-1 para que no se multiplique dos vedces el numero elegido.
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);

    }
}
