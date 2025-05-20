import java.util.Random;
public class EJERCICIOU2_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int vector_numeros[] = new int [10];


        for (int i = 0; i < vector_numeros.length ; i++){
            vector_numeros[i] = random.nextInt(10)+1;
        }
    }
    
}