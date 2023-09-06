package Project67;

import java.util.Scanner;

public class ArraySalaries {

    private Scanner sc;
    private float[] salaries;

    public void loadSalaries() {

        salaries = new float[5];
        
        sc = new Scanner(System.in);
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter a salary number " + (i + 1) + ":");
            salaries[i] = sc.nextFloat();
        }sc.close();

    }

    public void writeSalaries(){
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salary " +(i+1) +":"+ salaries[i]);
        }
    }

    public static void main(String[] args) {
        
        ArraySalaries aS = new ArraySalaries();
        aS.loadSalaries();
        aS.writeSalaries();
    }


}
