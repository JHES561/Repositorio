import java.util.Scanner;

public class EJERCICIO12U1 {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados");
        int cantidadEmpleados = plus.nextInt();
        
        int sueldoMayorATrecientos = 0;
        int sueldoMenorATrecientos = 0; 
        int gastoTotal = 0;

        for(int i = 1; i<= cantidadEmpleados;i ++){
            System.out.println("ingrese el sueldo del empleado "+ i);
            double sueldo = plus.nextInt();
        
            if (sueldo > 300 && sueldo <=500){
            sueldoMayorATrecientos++;
            }else if (sueldo >=100 && sueldo <=300) {
            sueldoMenorATrecientos++;
            }else {
                System.out.println("RANGO NO VALIDO ENTRE 100 Y 500");
            }
            gastoTotal += sueldo;
        }
        System.out.println("los empleados que cobran mas de 300 son "+ sueldoMayorATrecientos);
        System.out.println("los empleados que cobran mas de 100 y menos que 300 son "+ sueldoMenorATrecientos);
        System.out.println("El gasto total de la empresa es de " + gastoTotal);
        plus.close();
    }
}
