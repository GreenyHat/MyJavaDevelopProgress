package myjavadevelopprogress.pildoras_informaticas.POO;
// import java.io.Console;
// import java.util.Arrays;
import java.util.Scanner;


public class Ex_6_Fibonacci {
    public static void main(String[] args) {
        
        // Console console = System.console();
        Scanner scKey = new Scanner(System.in);
        byte nFirstNumber = 0, aux = 0, aux2 = 1, glass = 0;


        // if (console == null) {
        //     System.err.println("Console be cannot accesed");
        //     System.exit(1);
        // }
                //Estas lineas de codigo de arriba son para que no haya conflicto si la interfaz desde donde se ejecuta no dispusiera de consola.

        // char[] input = console.readPassword("Choose a number to limit the sequence(12 max, cause I've used byte like variable): ");
        // nFirstNumber = Byte.parseByte(new String(input));
        // Arrays.fill(input, ' '); // Borramos los caracteres del arreglo de caracteres


        System.out.println("Choose a number to limit the sequence(12 max, cause I've used byte like variable): ");
        nFirstNumber = scKey.nextByte();
        scKey.close();

        

        if (nFirstNumber<=12) {
            System.out.println("Fibonacci sequence:");
            for (int i = 0; i < nFirstNumber; i++) {
          
                glass = aux;
                aux=aux2;
                aux2=(byte)(glass+aux2); 
                
                System.out.println( glass); 
           }
        }else{
            System.out.println("Max 12, sorry");
           }
                
        }
        



    }

