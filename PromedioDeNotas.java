import java.util.Scanner;
public class PromedioDeNotas {

    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        System.out.println("ingrese nota 1");
        double nota1 = plus.nextDouble();

        System.out.println("ingrese nota 2");
        double nota2 = plus.nextDouble();

        System.out.println("ingrese nota 3");
        double nota3 = plus.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7){
            System.out.println("PROMOCIONADOO");
        }
        else {
            System.out.println("su promedio es " + promedio);
        }
        plus.close();
    }
}