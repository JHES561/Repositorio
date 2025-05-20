import java.util.Scanner;

public class EJERCICIO8U1 {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        System.out.println("ingrese cantidad de preguntas");
        double preguntas = plus.nextDouble();

        System.out.println("ingrese cantidad de preguntas correctas");
        double preguntasCorrectas = plus.nextDouble();

        double noventaPorciento = preguntas * 0.9; 

        double sieteCincoPorciento = preguntas * 0.75;

        double cincuentaPorciento = preguntas * 0.5;

        if (preguntasCorrectas >= noventaPorciento){
            System.out.println("NIVEL MAXIMO");
        } else if (preguntasCorrectas >=sieteCincoPorciento && preguntasCorrectas < noventaPorciento){
            System.out.println("NIVEL MEDIO");
        }else if (preguntasCorrectas >= cincuentaPorciento && preguntasCorrectas < sieteCincoPorciento) {
            System.out.println("NIVEL REGULAR");
        }else if (preguntasCorrectas < cincuentaPorciento) {
            System.out.println("FUERA DEL NIVEL");
        }
        plus.close();

    }
}
