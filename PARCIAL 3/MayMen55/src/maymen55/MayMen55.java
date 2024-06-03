import java.util.Scanner;

public class MayMen55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números (N): ");
        int N = sc.nextInt();
        int[] cantidades = obtenerCantidades(N);
        int cantidadMayor = encontrarCantidadMayor(cantidades);
        int cantidadMenor = encontrarCantidadMenor(cantidades);

        System.out.println("Cantidad mayor: " + cantidadMayor);
        System.out.println("Cantidad menor: " + cantidadMenor);
    }

    public static int[] obtenerCantidades(int N) {
        Scanner sc = new Scanner(System.in);
        int[] cantidades = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
        }

        return cantidades;
    }

    public static int encontrarCantidadMayor(int[] cantidades) {
        int cantidadMayor = Integer.MIN_VALUE;
        for (int cantidad : cantidades) {
            if (cantidad > cantidadMayor) {
                cantidadMayor = cantidad;
            }
        }
        return cantidadMayor;
    }

    public static int encontrarCantidadMenor(int[] cantidades) {
        int cantidadMenor = Integer.MAX_VALUE;
        for (int cantidad : cantidades) {
            if (cantidad < cantidadMenor) {
                cantidadMenor = cantidad;
            }
        }
        return cantidadMenor;
    }
}
