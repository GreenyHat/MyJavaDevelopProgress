package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class TestingClass2 {
    private String xString;
    private int xInteger;
    private float xFloat;
    private double xDouble;
    private char xChar;
    private Scanner xSc;

    public TestingClass2(){

        xString = "Hola";
        xInteger = 34;
        xFloat = 23.32f;
        xDouble = 2.5;
        xChar = 'A';
        xSc = new Scanner(System.in);

    }
    public void setxSc(Scanner xSc) {
        this.xSc = xSc;
    }

}
