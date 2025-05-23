import java.util.Random;

public class EJERCICIOU2_1 {
    
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector_numeros.length; i++){
            vector_numeros[i] = random.nextInt(10)+1;
        }
        for (int numero : vector_numeros ){
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("el cuadrado de "+ numero + "=" + cuadrado);
            System.out.println("el cubo de "+ numero + "="+ cubo);
        
        }
    }
}