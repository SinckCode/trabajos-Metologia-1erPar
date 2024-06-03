import java.util.Scanner;

public class MatrisX {
    public static void main(String[] args) {
        // Definir la matriz original
        int[][] matrizOriginal = {
                {1, 0, 0, 0, 6},
                {0, 2, 0, 7, 0},
                {0, 0, 3, 0, 0},
                {0, 8, 0, 4, 0},
                {9, 0, 0, 0, 5}
        };

        // Mostrar la matriz original
        System.out.println("Matriz X:");
        for (int[] fila : matrizOriginal) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        
        

        // Invertir la matriz y mostrarla
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = matrizOriginal[j][i];
            }
        }

        System.out.println("\nLa matriz X invertida es:");
        for (int[] fila : matrizInvertida) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        
    }
}
