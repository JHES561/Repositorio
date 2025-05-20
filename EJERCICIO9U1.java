import java.util.Scanner;
public class EJERCICIO9U1 {

    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        System.out.println("ingrese primer nota");
        double Nota1 = plus.nextDouble();

        System.out.println("ingrese segunda nota");
        double Nota2 = plus.nextDouble();

        System.out.println("ingrese tercer nota");
        double Nota3 = plus.nextDouble();

        double promedio = (Nota1 + Nota2 + Nota3) / 3;

        if (promedio >= 7){
            System.out.println("PROMOCIONADO");
        }else if (promedio >= 4){
            System.out.println("REGULAR");
        }else if (promedio < 4){
            System.out.println("REPROBADO");
        }else {
            System.out.println("RANGO NO VALIDO");
        }
        plus.close();
    }
}
