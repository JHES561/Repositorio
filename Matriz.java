public class Main {
    public static void main(String[] args) {
        // Crear una matriz de 3x3 con los números del 1 al 9
        int[][] matriz = new int[3][3];  // Matriz de 3 filas y 3 columnas
        int contador = 1;  // Empezamos con el número 1
        
        // Llenamos la matriz con los números del 1 al 9
        for (int i = 0; i < matriz.length; i++) {  // Recorremos las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorremos las columnas
                matriz[i][j] = contador;  // Asignamos el número al elemento de la matriz
                contador++;  // Incrementamos el contador
            }
        }
        
        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");  // Imprimimos el valor
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
