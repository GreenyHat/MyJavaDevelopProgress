package myjavadevelopprogress.pildoras_informaticas;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Ex_8_EmailValidation {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String email;
        byte atSign = 0;
        boolean dot = false, firstDot = false;

        email = JOptionPane.showInputDialog("Introduce your email: ");

        for (int i = 0; i < email.length() && !firstDot; i++) {

            if (email.charAt(i) == '@') {
                atSign++;

            } else if (email.charAt(i) == '.') {
                dot = true;
            }

            else if (email.charAt(0) == '.') {
                firstDot = true;
            }

        }
        // RESTRICTIONS:
        if (email.length() < 8 || !dot) {
            System.out.println("Your email must be longer");
        }     
        else if (atSign > 1) {

            System.out.println("You cannot to use more than one @");
        }
        else if (firstDot) {

            System.out.println("You cannot write a dot at the first");
            
        }else {
            System.out.println("Welcome to Accenture: ");
        }

    }
}
