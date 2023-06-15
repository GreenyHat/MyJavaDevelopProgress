package myjavadevelopprogress.pildoras_informaticas.POO;

public class TestingClasses {
    private int propertyInt;
    private String propertyString;
    private double propertyDouble;

    public TestingClasses() {// CONSTRUCTOR de la clase mediante el que se crean objetos de la clase, suele
                             // tener el mismo nombre que la clase

        propertyInt = 3;
        propertyDouble = 2.3;
        propertyString = "not defined";

    }

    public void setPropertyString() {// metodo setter establece valor de propiedad
        propertyString = "defined";// es privado pero accedemos con el metodo setter para ESTABLECER UN VALOR
    }

    public void setPropertyDouble() {
        propertyDouble = 5.6;
    }

    public void setPropertyInt() {
        propertyInt = 2;
    }

    public String getPropString() {// metodo getter devuelve valor de propiedad
        return propertyString;

    }

    public double getPropertyDouble() {
        return propertyDouble;
    }

    public int getPropertyInt() {
        return propertyInt;
    }

}