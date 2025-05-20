import java.util.Scanner;

public class mediaNumero1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tres números:");

        while (!input.hasNextDouble()) {
            System.out.println("Por favor, ingresa un número válido:");
            input.next();
        }
        double num1 = input.nextDouble();

        while (!input.hasNextDouble()) {
            System.out.println("Por favor, ingresa un número válido:");
            input.next();
        }
        double num2 = input.nextDouble();

        while (!input.hasNextDouble()) {
            System.out.println("Por favor, ingresa un número válido:");
            input.next();
        }
        double num3 = input.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.printf("El promedio es: %.2f%n", media);

        input.close();
    }
}
