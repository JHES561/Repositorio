import java.util.Scanner;

public class vector {
    
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);

        int arreglo [] = new int [4];

        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese valor para el indice "+ i);
            arreglo [i] = plus.nextInt();
        }
        for (int i=0; i<arreglo.length; i++){
            System.out.println("en el indice "+ i);
            System.out.println("hay un "+ arreglo[i]);
            System.out.println("-----------------------");
        }
        plus.close();
    }
}