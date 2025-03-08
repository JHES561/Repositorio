import java.util.Scanner;

public class MediaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tres números:");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        
        float media = (num1 + num2 + num3) / 3;
        
        System.out.printf("El promedio es:", media);

        input.close();
    }
}
