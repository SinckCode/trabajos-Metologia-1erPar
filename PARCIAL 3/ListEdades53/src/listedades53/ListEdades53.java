import java.util.Scanner;

public class ListEdades53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos (N): ");
        int N = sc.nextInt();
        int[] edades = obtenerEdades(N);
        double edadPromedio = calcularEdadPromedio(edades);

        System.out.println("Edad promedio del grupo: " + edadPromedio);
        mostrarListadoEdades(edades);
    }

    public static int[] obtenerEdades(int N) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        return edades;
    }

    public static double calcularEdadPromedio(int[] edades) {
        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        return (double) sumaEdades / edades.length;
    }

    public static void mostrarListadoEdades(int[] edades) {
        System.out.println("Listado de edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + edades[i]);
        }
    }
}
