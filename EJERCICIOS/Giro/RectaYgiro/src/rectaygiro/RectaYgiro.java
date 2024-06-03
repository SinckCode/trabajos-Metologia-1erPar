import java.util.Scanner;

public class RectaYgiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de las medidas de los rectángulos
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Determinar si alguno de los rectángulos se puede meter dentro del otro
        // y si es necesario girarlos
        int[] resultados = determinarInclusionYGiro(A, B, C, D);

        // Mostrar el resultado
        System.out.println(resultados[0] + " " + resultados[1]);
    }

    // Función para determinar si alguno de los rectángulos se puede meter dentro del otro
    // y si es necesario girarlos
    private static int[] determinarInclusionYGiro(int A, int B, int C, int D) {
        int[] resultados = new int[2];

        if ((A <= C && B <= D) || (A <= D && B <= C)) {
            // Al menos uno de los rectángulos se puede meter dentro del otro
            resultados[0] = 1;

            if (A == C && B == D) {
                // No es necesario girar, son iguales
                resultados[1] = 0;
            } else if (A == D && B == C) {
                // Se debe hacer un giro de 90 grados
                resultados[1] = 1;
            } else {
                // En cualquier otro caso, no es necesario girar
                resultados[1] = 0;
            }
        } else if ((C <= A && D <= B) || (C <= B && D <= A)) {
            // El segundo rectángulo se puede meter dentro del primero
            resultados[0] = 2;
            resultados[1] = 1;  // Se debe hacer un giro de 90 grados
        } else {
            // Ninguno de los dos rectángulos se puede meter dentro del otro
            resultados[0] = 0;
            resultados[1] = 0;
        }

        return resultados;
    }
}
