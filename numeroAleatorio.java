import java.util.Random;

public class numeroAleatorio {
    public static void main(String[] args) {
        Random dado = new Random();

        int numero;

        for(int i = 0; i < 10; i++){
        numero = dado.nextInt(9)+1;

        System.out.println(numero);
        }
    }
}
