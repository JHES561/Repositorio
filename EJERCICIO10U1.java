import java.util.Scanner;

public class EJERCICIO10U1 {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);
    
    System.out.println("Ingrese cantidad de Años de antiguedad");
    int años = plus.nextInt();

    System.out.println("Ingrese su sueldo actual");
    double sueldo = plus.nextDouble();

    if (sueldo < 500 && años > 10 ){
        double porcentaje = sueldo * 0.20;
        double aumento = sueldo + porcentaje;
        System.out.println("Su sueldo es de "+ aumento);
    }else if (sueldo < 50 && años < 10){
        double porcentaje = sueldo * 0.5;
        double aumento = sueldo + porcentaje;
        System.out.println("Su sueldo es de "+ aumento);
    }else if (sueldo >= 500){
        System.out.println("Su sueldo es de "+ sueldo);
    }else {
        System.out.println("RANGO NO VALIDO");
    }
    plus.close();
    }
}
