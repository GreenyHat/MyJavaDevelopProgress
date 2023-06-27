package myjavadevelopprogress.pildoras_informaticas.POO;

public class UseTesting {
    
    public static void main(String[] args) {
        
        // TestingClasses testing = new TestingClasses(9); constructor con parametros
         TestingClasses testing = new TestingClasses(); 
         TestingClasses testing2 = new TestingClasses(2, "Xd", 4.6);
        
        testing.setPropertyString();
        System.out.println(testing.getPropString());

        testing.setPropertyDouble();//toma la definición de clase ya que no hemos puesto parámetros de entrada en el método de clase
        System.out.println( "Esto es el doble: " + testing.getPropertyDouble());

        testing.setPropertyInt(400);//Con esto estamos definiendo en la instancia la propiedad
        System.out.println(testing.getPropertyInt());

        testing.setPropertyBool(false, true,false);//SOBRECARGA DE MÉTODOS, SI PONEMOS 3 argumentos llamará al otro setter, si ponemos 1 llamará al
        System.out.println(testing.getPropertyBool());

        System.out.println("The string value in the object number two is: " + testing2.getPropString());   
        System.out.println("The integer value in the object number two is: " + testing2.getPropertyInt());   
    }
}
