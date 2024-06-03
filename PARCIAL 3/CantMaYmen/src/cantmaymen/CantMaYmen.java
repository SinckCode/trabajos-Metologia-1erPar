import java.util.Scanner;

public class CantMaYmen {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Cuantos numeros vas a ingresar?");
        int numIngres = consola.nextInt();

        float[] valores = new float[numIngres];

        for (int i = 0; i < numIngres; i++) {
            System.out.println("Escribe el valor del num " + (i + 1));
            valores[i] = consola.nextFloat();
        }

        float max = encontrarMaximo(valores);
        float min = encontrarMinimo(valores);

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
    }

    public static float encontrarMaximo(float[] array) {
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static float encontrarMinimo(float[] array) {
        float min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
