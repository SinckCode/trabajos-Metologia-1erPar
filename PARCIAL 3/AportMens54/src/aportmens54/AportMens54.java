import java.util.Scanner;

public class AportMens54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de meses: ");
        int meses = sc.nextInt();
        double[] aportacionesMensuales = obtenerAportacionesMensuales(meses);
        double ahorroTotal = calcularAhorroTotal(aportacionesMensuales);

        System.out.println("Ahorro total en un año: " + ahorroTotal);
        mostrarAportacionesMensuales(aportacionesMensuales);
    }

    public static double[] obtenerAportacionesMensuales(int meses) {
        Scanner sc = new Scanner(System.in);
        double[] aportaciones = new double[meses];

        for (int mes = 0; mes < meses; mes++) {
            System.out.print("Ingrese la cantidad de dinero aportada en el mes " + (mes + 1) + ": ");
            aportaciones[mes] = sc.nextDouble();
        }

        return aportaciones;
    }

    public static double calcularAhorroTotal(double[] aportaciones) {
        double ahorroTotal = 0;
        for (double aportacion : aportaciones) {
            ahorroTotal += aportacion;
        }
        return ahorroTotal;
    }

    public static void mostrarAportacionesMensuales(double[] aportaciones) {
        System.out.println("Aportaciones mensuales:");
        for (int mes = 0; mes < aportaciones.length; mes++) {
            System.out.println("Mes " + (mes + 1) + ": " + aportaciones[mes]);
        }
    }
}
