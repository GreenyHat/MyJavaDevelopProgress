package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class Ex_13_ATS_arrays_mixed {
    public static void main(String[] args) {
        int [] firstTable = new int[10];
        int [] secondTable = new int[10];
        int [] mixedTable = new int[20];
        Scanner sc = new Scanner(System.in);

        //primer array 
        System.out.println("First array:");
        for (int i = 0; i < firstTable.length; i++) {
            System.out.print((i+1) + ". Enter a number:");
            	firstTable[i] = sc.nextInt();
        }
        //segundo array
        System.out.println("\nSecond array:");
        for (int i = 0; i < secondTable.length; i++) {
            System.out.print((i+1) + ". Enter a number: ");
            secondTable[i] = sc.nextInt();
        }sc.close();
        //mezcla de arrays con array multidimensional 
        //usando un iterador para first y second y otro para mixed
        int j = 0;
       for (int i = 0; i < 10; i++) { 
        mixedTable[j] = firstTable[i];
        j++;
        mixedTable[j] = secondTable[i];
        j++;
       }
       System.out.print("\nMixed table: \n");
       for (int k = 0; k < mixedTable.length; k++) {
        System.out.print((k+1 + ". ") + mixedTable[k] + "\n");
       }
       System.out.println();
    }
}

/**
 * 1. Pensar el problema
 * 2. Declarar elementos
 * 3. Definir los arrays
 * 4. Relacionar los arrays mediante un iterador independiente (j) que servira para almacenar los datos de las dos iteraciones
 * 5. Mostrar el array **NOTESE que se usa print para que no muestre el salto de linea por defecto
 * 
 * Importante fijarse en el uso de los iteradores y de los indices de los arrays!!
 */