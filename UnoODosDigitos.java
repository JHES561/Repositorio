import java.util.Scanner;
public class UnoODosDigitos {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        System.out.println("ingrese numero de 1 o 2 digitos");
       int numero = plus.nextInt();

        if (numero >= 1) {
            if (numero < 10){
                System.out.println("su numero es de un digito");}
            else {
                System.out.println("su numero es de dos digitos");
            }
        }
        else {
            System.out.println("RANGO NO VALIDO");
        }
        plus.close();
    }
}
