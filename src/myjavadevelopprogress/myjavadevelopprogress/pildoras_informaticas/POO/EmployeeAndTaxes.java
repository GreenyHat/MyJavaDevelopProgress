package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class EmployeeAndTaxes {
    private String nameEmpl;
    private float salary;
    private Scanner sc = new Scanner(System.in);

    public void loadData() {
        System.out.print("Name of the employee: ");
        nameEmpl = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextFloat();
        sc.close();
    }

    public void printData() {
        System.out.println("\nEmployee data: ");
        System.out.println("Name: " + nameEmpl);
        System.out.println("Salary: " + salary);

        if (salary > 3000) {
            System.out.println("Salary is taxable");
        } else {
            System.out.println("Salary is not taxable");
        }
    }
    public static void main(String[] args) {
        EmployeeAndTaxes employee1 = new EmployeeAndTaxes();
        employee1.loadData();
        employee1.printData();
    }

}
