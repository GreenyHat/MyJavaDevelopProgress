package Project66;

import java.util.Scanner;

/**
 * Lo primero es un metodo para cargar el valor hasta que se cierre la
 * "interfaz" donde inicializo los datos que voy a usar
 * el valor para el metodo y el scaner para los registros
 * luego la interfaz nos pregunta, el numero introducido es distinto a -1? si es
 * asi arranca el metodo calculate
 * Luego en el metodo calculate lo que se busca es incrementar en cada bucle el
 * valor incial mas el mismo de forma incremental
 * es decir si introduzco 4, mientras no llegue a 40 (i<=v*10) le sumo 4
 */

public class MultiplicationTable {

    public void loadValue() {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.print("Enter a number:");
            value = sc.nextInt();
            calculate(value);

        } while (value != -1);
        sc.close();

    }

    public void calculate(int v) {
        for (int i = v; i <= v * 10; i += v) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.loadValue();
        // table.calculate(4); //directamente podria pedir una tabla concreta
    }
}
