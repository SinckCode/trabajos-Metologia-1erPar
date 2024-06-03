import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los tres números
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Leer el orden deseado
        String order = scanner.next();

        // Llamar a la función para ordenar y mostrar el resultado
        int[] result = ordenarNumeros(a, b, c, order);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para ordenar los números según el orden deseado
    public static int[] ordenarNumeros(int a, int b, int c, String order) {
        int[] result = new int[3];

        // Ordenar los números según el orden deseado
        result[0] = (order.charAt(0) == 'A') ? a : ((order.charAt(0) == 'B') ? b : c);
        result[1] = (order.charAt(1) == 'A') ? a : ((order.charAt(1) == 'B') ? b : c);
        result[2] = (order.charAt(2) == 'A') ? a : ((order.charAt(2) == 'B') ? b : c);

        return result;
    }
}
