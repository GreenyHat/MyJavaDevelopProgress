package myjavadevelopprogress.pildoras_informaticas.POO;

public class TestingClasses {
    private int propertyInt;
    private String propertyString;
    private double propertyDouble;
    private boolean element1;
    private boolean element2;
    private boolean element3;
    private boolean propertyBool;


    public TestingClasses(){//CONSTRUCTOR de la clase mediante el que se crean objetos de la clase

        propertyInt = 3;
        propertyDouble = 2.3;
        propertyString = "not defined";
    }

    /*
     * NOTAS:
     * Esto puede tener sentido si la mayoría de tus objetos van a tener el estado
     * inicial definido
     * pero te quieres asegurar de que es posible modificarlo con un setter si fuese
     * necesario
     */

    public TestingClasses(int propertyInt, String propeString, double propertyDouble) {// constructor con parámetros
                                                                                       // (sobrecarga de constructores)

        this.propertyInt = propertyInt;
        this.propertyDouble = propertyDouble;
        this.propertyString = propeString;
    }

    public void setPropertyBool(boolean element1) {// es redundante pero es para ejemplificar la sobrecarga de métodos

        this.element1 = element1;
    }

    public void setPropertyBool(boolean element1, boolean element2, boolean element3) {

        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public void setPropertyString() {// metodo setter establece valor de propiedad
        propertyString = "defined";// es privado pero accedemos con el metodo setter para ESTABLECER UN VALOR
    }

    public void setPropertyDouble() {
        propertyDouble = 5.6;
    }

    public void setPropertyInt(){
        propertyInt = 2;
    }

    public String getPropString() {// metodo getter devuelve valor de propiedad
        return propertyString;

    }

    public boolean getPropertyBool(){
        return propertyBool;
    }

    public double getPropertyDouble() {
        return propertyDouble;
    }

    public int getPropertyInt() {
        return propertyInt;
    }
    
}