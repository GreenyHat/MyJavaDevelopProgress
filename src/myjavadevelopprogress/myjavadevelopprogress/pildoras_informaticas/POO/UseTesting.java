package myjavadevelopprogress.pildoras_informaticas.POO;

public class UseTesting {

    ////// Esto se podría arreglar modularizando en metodos los distintos setters y
    ////// getters e invocandolos en el main()
    public static void main(String[] args) {

        // TestingClasses testing = new TestingClasses(9); constructor con parametros
        TestingClasses testing = new TestingClasses();
        TestingClasses testing2 = new TestingClasses(7, "Xd", 4.6);

        testing.setPropertyString();
        System.out.println(testing.getPropString());

        testing.setPropertyDouble();// toma la definición de clase ya que no hemos puesto parámetros de entrada en
                                    // el método de clase
        System.out.println("Esto es el double: " + testing.getPropertyDouble());

        testing.setPropertyInt();// Con esto estamos definiendo en la instancia la propiedad
        System.out.println(testing.getPropertyInt());

    
        System.out.println("Este es un valor del int con parametro: " + testing2.getPropertyInt());
        testing2.setPropertyInt(544);
        System.out.println("Este es otro: " + testing2.getPropertyInt());
        testing2.setPropertyInt(22222);
        System.out.println("Este es otro: " + testing2.getPropertyInt());

        // testing.setPropertyBool(false, true, false);// SOBRECARGA DE MÉTODOS, SI
        // PONEMOS 3 argumentos llamará al otro
        // setter, si ponemos 1 llamará al
        System.out.println(testing.getPropertyBool());

        System.out.println("The string value in the object number two is: " + testing2.getPropString());
        System.out.println("The integer value in the object number two is: " + testing2.getPropertyInt());
    }
}
