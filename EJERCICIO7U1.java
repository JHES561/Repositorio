import java.util.Scanner;

public class EJERCICIO7U1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo (máximo 3 cifras): ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else if (numero < 10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero < 100) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero < 1000) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("Error: El número tiene más de 3 cifras.");
        }

        scanner.close();
    }
}