import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los valores de a y b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calcular y mostrar la suma de números impares en el intervalo [a, b]
        int resultado = 0;

        for (int i = a; i <= b; i++) {
            if (esImpar(i) == 1) {
                resultado += i;
            }
        }

        System.out.println(resultado);
    }

    // Función para determinar si un número es par o impar
    static int esImpar(int m) {
        return m % 2 != 0 ? 1 : 0;
    }
}
