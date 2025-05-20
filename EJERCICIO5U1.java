import java.util.Scanner;

public class EJERCICIO5U1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (distinto al primero): ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números ingresados son iguales. Deben ser distintos.");
        } else {

            int mayor = (numero1 > numero2) ? numero1 : numero2;
            System.out.println("El mayor número es: " + mayor);
        }

        scanner.close();
    }
}
