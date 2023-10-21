// public void loadData() {
// employeeAM = new int[4];
// employeePM = new int[4];
// sc = new Scanner(System.in);
// int indexAM = 0, indexPM = 0;

// for (int i = 0; (indexAM < 4 || indexPM < 4) && i < 8; i++) {
// System.out.print("Enter the salary number " + (i + 1) + ": ");
// salary = sc.nextDouble();

// if (salary > 1500 && indexAM < 4) {
// employeeAM[indexAM] = (int) salary;
// indexAM++;
// } else if (salary < 1500 && indexPM < 4) {
// employeePM[indexPM] = (int) salary;
// indexPM++;
// }
// if (indexAM == 4 && indexPM == 4) {
// break;
// }

// }
// }
package Project67;

import java.util.Scanner;

public class SalaryPerTurn {
    private int[] employeeAM, employeePM;  
    
    // PROPUESTA MEJORADA:

    public void loadData() {
        employeeAM = new int[4];
        employeePM = new int[4];
        private Scanner sc = new Scanner(System.in);

        private double salary;

        int indexAM = 0, indexPM = 0;

        // Manage of employeeAM
        while (indexAM < 4) {
            System.out.print("Enter the salary for morning shift " + (indexAM + 1) + ": ");
            salary = sc.nextDouble();
            if (salary <= 1500 && indexAM < 4) {
                employeeAM[indexAM] = (int) salary;
                indexAM++;
            } else {
                System.out.println(
                        "Is not possible, the salaries of the morning shift are below 1500. Enter another amount");
            }

        }

        // Manage of employeePM
        while (indexPM < 4) {
            System.out.print("Enter the salary for afternoon shift " + (indexPM + 1) + ": ");
            salary = sc.nextDouble();
            if (salary > 1500 && indexPM < 4) {
                employeePM[indexPM] = (int) salary;
                indexPM++;
            } else {
                System.out.println(
                        "Is not possible, the salaries of the afternoon shift are below 1500. Enter another amount");

            }
        }
    }

    public void showData() {

        System.out.println("Morning turn:");
        for (int i = 0; i < employeeAM.length; i++) {
            System.out.println("Salary " + (i + 1) + ": " + employeeAM[i]);
        }

        System.out.println("Afternoon turn:");
        for (int i = 0; i < employeePM.length; i++) {
            System.out.println("Salary " + (i + 1) + ": " + employeePM[i]);
        }
    }

    public void calculateSpent() {
        float aM = 0, pM = 0;

        for (int i = 0; i < employeeAM.length; i++) {
            aM += employeeAM[i];
        }
        for (int i = 0; i < employeePM.length; i++) {
            pM += employeePM[i];
        }
        System.out.print("The spent are: " + aM + " in the monrning turn, and " + pM + " in the afternoon turn");
    }

    public static void main(String[] args) {
        SalaryPerTurn sa = new SalaryPerTurn();
        sa.loadData();
        sa.showData();
        sa.calculateSpent();
    }
}
