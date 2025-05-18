import java.util.Scanner;

public class notasMayoresYMenoresQue7 {
    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);
    
        int mayoresOIgualesA7 = 0;
        int menoresQ7 = 0;
            for (int i = 1; i <=10; i++){
            System.out.println("Ingrese la nota del alumno "+ i);
            double nota = plus.nextDouble();
            if (nota >= 7) {
                mayoresOIgualesA7++;
            }else if (nota < 7) {
                menoresQ7++;
            }
        }
        System.out.println("Los alumnos con notas mayor a 7 son : "+ mayoresOIgualesA7);
        System.out.println("los alumnos con notas menores que 7 son: "+ menoresQ7);

        plus.close();
    }
}