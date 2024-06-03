import java.util.Scanner;

public class GatosYRaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las posiciones iniciales de los gatos y el ratón
        int posicionGatoA = scanner.nextInt();
        int posicionGatoB = scanner.nextInt();
        int posicionRaton = scanner.nextInt();

        // Determinar el ganador
        int tiempoGatoA = Math.abs(posicionGatoA - posicionRaton);
        int tiempoGatoB = Math.abs(posicionGatoB - posicionRaton);

        String ganador;
        if (tiempoGatoA < tiempoGatoB) {
            ganador = "gato A";
        } else if (tiempoGatoB < tiempoGatoA) {
            ganador = "gato B";
        } else {
            ganador = "raton C";
        }

        // Imprimir el resultado
        System.out.println(ganador);
    }
    
}
