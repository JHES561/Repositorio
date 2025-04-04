import java.util.Scanner;

public class NuevoEjercicio {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero:");
        int inicio = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int fin = input.nextInt();

        System.out.println("El primer numero es " + inicio + " el segundo numero es " + fin);

        if (inicio < 0 || fin < inicio) {
            System.out.println("Rango no valido");
            input.close();
            return;
        }

        int contPrimos = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i < 1) {
                continue;
            }

            if (i == 2) {
                contPrimos += 1;
                System.out.println(i);
            }

            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("Hay " + (int) (Math.floor(contPrimos / 2)) + " pares de primos en total");
    }
}
