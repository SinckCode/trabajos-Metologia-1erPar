import java.util.Scanner;

public class GatosYRaton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las posiciones iniciales de los gatos y el ratón
        int posicionGatoA = scanner.nextInt();
        int posicionGatoB = scanner.nextInt();
        int posicionRaton = scanner.nextInt();

        // Determinar el ganador
        String ganador = determinarGanador(posicionGatoA, posicionGatoB, posicionRaton);

        // Imprimir el resultado
        System.out.println(ganador);

        scanner.close();
    }

    static String determinarGanador(int posicionGatoA, int posicionGatoB, int posicionRaton) {
        int tiempoGatoA = Math.abs(posicionGatoA - posicionRaton);
        int tiempoGatoB = Math.abs(posicionGatoB - posicionRaton);

        if (tiempoGatoA < tiempoGatoB) {
            return "gato A";
        } else if (tiempoGatoB < tiempoGatoA) {
            return "gato B";
        } else {
            return "raton C";
        }
    }
}
