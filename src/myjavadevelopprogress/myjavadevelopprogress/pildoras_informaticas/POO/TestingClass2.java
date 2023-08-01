package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class TestingClass2 {
    private Scanner sc;
    private String name;
    private int age;

    public void Initialize() {
        sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.close();
    }

    public void ShowData() {
        System.out.println("\nNombre: " + name);
        System.out.println("Age: " + age);

    }

    public void IsAdult() {
        if (age >= 21) {
            System.out.println("The subjet is an adult");
        } else {
            System.out.println("The subject is not an adult");
        }
    }

    public static void main(String[] args) {

        TestingClass2 subject = new TestingClass2();
        subject.Initialize();
        subject.ShowData();
        subject.IsAdult();
    }

}
