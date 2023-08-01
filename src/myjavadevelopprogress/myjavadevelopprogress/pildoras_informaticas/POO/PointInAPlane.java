package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class PointInAPlane {
    private float x, y;
    Scanner sc = new Scanner(System.in);

    public void loadData() {
        System.out.print("X value: ");
        x = sc.nextFloat();
        System.out.print("Y value:");
        y = sc.nextFloat();
        sc.close();
    }

    public void printData() {

        if (x > 0 && y > 0) {
            System.out.println("The point is in the first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the second quadrant");
        }

        else if (x < 0 && y < 0) {
            System.out.println("The point is in the third quadrant");
        }

        else if (x > 0 && y < 0) {
            System.out.println("The point is in the fourth quadrant");
        }else{
            System.out.println("The point is not in a quadrant");
        }
    }

    public static void main(String[] args) {
        PointInAPlane point = new PointInAPlane();
        point.loadData();
        point.printData();
    }
}
