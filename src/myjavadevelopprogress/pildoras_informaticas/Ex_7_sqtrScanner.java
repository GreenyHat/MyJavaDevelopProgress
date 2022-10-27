package myjavadevelopprogress.pildoras_informaticas;
import javax.swing.JOptionPane;
// import java.util.Scanner;
public class Ex_7_sqtrScanner {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Give me a number to calulate the square root"));
        // Scanner scKey = new Scanner(System.in);

        float result= (float)Math.sqrt(number);//Casting to float 
        System.out.println("The square root of " + number+ " is: " + result);         
    }
}
