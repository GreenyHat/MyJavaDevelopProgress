package myjavadevelopprogress.pildoras_informaticas.POO;

public class UseTesting {
    
    public static void main(String[] args) {
        
        TestingClasses testing = new TestingClasses();
        
        testing.setPropertyString();
        System.out.println(testing.getPropString());
        testing.setPropertyDouble();
        System.out.println( "Esto es el doble: " + testing.getPrpertyDouble());

    }
}
