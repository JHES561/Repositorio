import java.util.Scanner;
public class SueldoDeUnaPersona {

    public static void main(String[] args) {
    Scanner plus = new Scanner(System.in);

    System.out.println("ingrese su sueldo en dolares");
    double sueldo = plus.nextDouble();

    if (sueldo > 3000) {
        System.out.println("DEBE ABONAR IMPUESTOS");
    }
    else {
        System.out.println("Su sueldo es " + sueldo);
    }
    plus.close();
    }
}