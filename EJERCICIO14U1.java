import java.util.Scanner;

public class EJERCICIO14U1 {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        for (int i = 1; i <= 50; i++){
            int valor = 5 * i;
            System.out.println("5 x "+ i + "=" + valor);
        }
        plus.close();
    }
}
