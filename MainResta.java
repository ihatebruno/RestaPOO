import java.util.Scanner;
public class MainResta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resta res = new Resta();
        
        System.out.println("Ingresa el primer numero: ");
        res.setA(sc.nextInt());

        System.out.println("Ingresa el segundo numero: ");
        res.setB(sc.nextInt());

        System.out.println(res.restar());
        System.out.println(res.toString());

        res.getA();
        res.getB();
    }
}