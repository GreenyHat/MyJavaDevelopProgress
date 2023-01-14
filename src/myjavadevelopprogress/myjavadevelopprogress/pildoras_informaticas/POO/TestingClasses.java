package myjavadevelopprogress.pildoras_informaticas.POO;

public class TestingClasses {

    public TestingClasses(){//CONSTRUCTOR de la clase mediante el que se crean objetos de la clase

    //public TestingClasses(int propertyInt){//CONSTRUCTOR con parametros

        // this.propertyInt = propertyInt; para indicar que el nuevo valor lo obtiene la variable de la clase, para eso el this
        propertyInt = 5;
        propertyDouble = 2.1;
        propertyString = "not defined";

    }

    public void setPropertyString(){//metodo setter establece valor de propiedad
        propertyString = "defined";//es privado pero accedemos con el metodo setter para ESTABLECER UN VALOR
    }

    public void setPropertyDouble(){
        propertyDouble = 5.6;
    }

    public String getPropString(){//metodo getter devuelve valor de propiedad
        return propertyString;
        
    }

    public double getPropertyDouble(){
        return propertyDouble;
    }

    public int getPropertyInt(){
        return propertyInt;
    }

    private int propertyInt;
    private String propertyString;
    private double propertyDouble;
    
}
