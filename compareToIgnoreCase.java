import java.util.Scanner;

public class compareToIgnoreCase {
    public static void main(String[] args) {
    Scanner plus = new Scanner(System.in);

    System.out.println("ingrese primer nombre");
    String nombre1 = plus.nextLine();

    System.out.println("ingrese segundo nombre");
    String nombre2 = plus.nextLine();

    if (nombre1.compareToIgnoreCase(nombre2)==0){
        System.out.println("los nombres son iguales");
    }else if (nombre1.compareToIgnoreCase(nombre2)<0){
        System.out.println("el orden es");
        System.out.println(nombre1);
        System.out.println(nombre2);
    }else{
        System.out.println("el orden es");
        System.out.println(nombre1);
        System.out.println(nombre2);
    }
    plus.close();
    }
}
