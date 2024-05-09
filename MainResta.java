import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        Resta res = new Resta(); // Crear un objeto Resta.

        // Solicitar al usuario que ingrese los dos números.
        System.out.println("Ingresa el primer numero: ");
        res.setA(sc.nextInt()); // Leer el primer número y establecerlo en el objeto Resta.

        System.out.println("Ingresa el segundo numero: ");
        res.setB(sc.nextInt()); // Leer el segundo número y establecerlo en el objeto Resta.

        System.out.println(res.restar()); // Imprimir el resultado de la resta.
        System.out.println(res.toString()); // Imprimir la representación en cadena del objeto Resta.

        // Llamar a los métodos getter, pero no se hace nada con los valores de retorno.
        res.getA();
        res.getB();
    }
}
