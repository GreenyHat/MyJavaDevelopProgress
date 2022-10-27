package myjavadevelopprogress.pildoras_informaticas;
import javax.swing.*;

public class Ex_6 {

                ///////////////////EXERCISES WITH WINDOW/////////////////////////////////
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("Whats your name?");
        int age = Integer.parseInt( JOptionPane.showInputDialog("How old are you?"));
        System.out.println("Your name is: "+name+ "and you are "+age+" years old" );
    }
    
}
