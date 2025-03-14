import java.util.Scanner;
public class numerosPrimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int inicio = input.nextInt();

        System.out.println("ingrese el segundo numero");
        int fin = input.nextInt();

        System.out.println(" el primer numero es "+ inicio + " el segundo numero es "+ fin);

        if (inicio<0 || fin < inicio){
            System.out.println("rango no valido");
            input.close();
            return;
        }
        int contPrimos = 0;
        for (int i=inicio ; i <= fin ; i++){
            if (i <= 1){
                continue;
            }
            if (i == 2){
                contPrimos += 1;
            }
            if (i % 2 == 1){
                contPrimos +=1;
                System.out.println(i);
            }
        }
        System.out.println(" hay " + (int) (Math.floor(contPrimos/2 ))+ " pares de primos en total ");
    }

}