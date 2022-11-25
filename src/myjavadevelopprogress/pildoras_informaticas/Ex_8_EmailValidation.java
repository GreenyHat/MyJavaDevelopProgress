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
    boolean dot = false;
    
     email = JOptionPane.showInputDialog("Introduce your email: ");

     for (int i = 0; i < email.length(); i++) {

        if (email.charAt(i)=='@') {
            atSign++;
            
        }
        else if (email.charAt(i)=='.') {
            dot = true;
        }
        
    }
    if (email.length()<4) {
        System.out.println("Your email must be longer");
    }

    else if (atSign>1) {
        System.out.println("You cannot to use more than one @");
        
    }
    
    else{
        System.out.println("Welcome to Accenture: ");
    }
    
    }
}
