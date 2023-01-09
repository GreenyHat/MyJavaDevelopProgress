package myjavadevelopprogress.pildoras_informaticas.POO;

public class TestingClasses {

    public TestingClasses(){//contructor de la clase mediante el que se crean objetos de la clase

        propertyInt = 4;
        porpertyDouble = 2.1;
        propertyString = "not defined";

    }

    public void setPropertyString(){//metodo setter establece valor de propiedad
        propertyString = "defined";//es privado pero accedemos con el metodo setter para ESTABLECER UN VALOR
    }

    public void setPropertyDouble(){
        porpertyDouble = 5.6;
    }

    public String getPropString(){//metodo getter devuelve valor de propiedad
        return propertyString;
        
    }

    public double getPrpertyDouble(){
        return porpertyDouble;
    }

    private int propertyInt;
    private String propertyString;
    private double porpertyDouble;
    
}
