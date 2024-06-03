import java.util.Scanner;

public class EmpresaTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int numChoferes = 2;
        String[] nombres = new String[numChoferes];
        int[][] horasTrabajadas = new int[numChoferes][6]; // 6 días de la semana
        double[] sueldoPorHora = new double[numChoferes];

        // Ingreso de datos
        for (int i = 0; i < numChoferes; i++) {
            System.out.println("Ingrese el nombre del chofer " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            for (int j = 0; j < 6; j++) {
                System.out.println("Ingrese las horas trabajadas el día " + obtenerNombreDia(j) + " para " + nombres[i] + ": ");
                horasTrabajadas[i][j] = scanner.nextInt();
            }

            System.out.println("Ingrese el sueldo por hora para " + nombres[i] + ": ");
            sueldoPorHora[i] = scanner.nextDouble();

            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Calcular total de horas trabajadas y sueldo semanal
        int[] totalHorasSemana = new int[numChoferes];
        double[] sueldoSemanal = new double[numChoferes];
        for (int i = 0; i < numChoferes; i++) {
            for (int j = 0; j < 6; j++) {
                totalHorasSemana[i] += horasTrabajadas[i][j];
            }
            sueldoSemanal[i] = totalHorasSemana[i] * sueldoPorHora[i];
        }

        // Calcular el total que pagará la empresa
        double totalPagoEmpresa = 0;
        for (int i = 0; i < numChoferes; i++) {
            totalPagoEmpresa += sueldoSemanal[i];
        }

        // Encontrar el nombre del trabajador que labora más horas el día lunes
        int indiceMaxHorasLunes = 0;
        int maxHorasLunes = horasTrabajadas[0][0];
        for (int i = 1; i < numChoferes; i++) {
            if (horasTrabajadas[i][0] > maxHorasLunes) {
                maxHorasLunes = horasTrabajadas[i][0];
                indiceMaxHorasLunes = i;
            }
        }

        // Imprimir reporte
        System.out.println("\n=== Reporte de la Empresa de Transporte ===");
        for (int i = 0; i < numChoferes; i++) {
            System.out.println("\nChofer: " + nombres[i]);
            System.out.println("Total de horas trabajadas: " + totalHorasSemana[i] + " horas");
            System.out.println("Sueldo semanal: $" + sueldoSemanal[i]);
        }

        System.out.println("\nTotal que pagará la empresa: $" + totalPagoEmpresa);
        System.out.println("Trabajador que labora más horas el día lunes: " + nombres[indiceMaxHorasLunes]);
    }

    // Método auxiliar para obtener el nombre del día según el índice
    private static String obtenerNombreDia(int indice) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        return diasSemana[indice];
    }
}
