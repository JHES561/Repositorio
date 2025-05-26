import java.util.Scanner;

public class VectorCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5];

        // Leer datos desde teclado
        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Mostrar el vector invertido
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInverso.length; i++) {
            System.out.println("Elemento " + i + ": " + vectorInverso[i]);
        }

        scanner.close();
    }
}
