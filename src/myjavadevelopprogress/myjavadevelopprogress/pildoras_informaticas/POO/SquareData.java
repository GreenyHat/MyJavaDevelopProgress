package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class SquareData {
    private float side;
    private Scanner sc = new Scanner(System.in);

    public void loadSidesValue() {
        System.out.print("Enter the side en cm: ");
        sc.close();
    }

    public void printPerimeter() {
       float perimeter = side * 4;
        System.out.println("The square's perimeter is: " + perimeter);
    }

    public void printArea() {
       float area = side * side;
        System.out.println("The square's area is: " + area);
    }

    public static void main(String[] args) {
        SquareData square = new SquareData();
        square.loadSidesValue();
        square.printPerimeter();
        square.printArea();
    }
}
