package myjavadevelopprogress;


/**
 *
 * @author Greeny
 */
    import java.util.Scanner;

    public class Ex_5 {
        ///////////////AQUI EMPIEZAN EJERCICIOS DE PÍLDORAS//////////////////
        
    public static void main(String[] args){ 
        Double numero = 0.0, resultado=0.0;
        Scanner scKey = new Scanner(System.in);
        Scanner sckey2 = new Scanner(System.in);
        System.out.println("Dame un número para calcular raíz cuadrada: ");
        
        numero = scKey.nextDouble();
        resultado = Math.sqrt(numero);

        System.out.println("El resultado de la operación es: " + resultado +
         " que es la raíz cuadrada de "+ numero);

         System.out.println("Intruduce el número que quieres elevar y luego el exponente: ");
         double base,exponente,resultadoPotencia;

         base = sckey2.nextDouble();
         exponente = sckey2.nextDouble();
         resultadoPotencia = Math.pow(base,exponente);
         System.out.println("El resultado de " + base +" elevado a "+ exponente + "da : "+resultadoPotencia);
     }   

    
    
 }