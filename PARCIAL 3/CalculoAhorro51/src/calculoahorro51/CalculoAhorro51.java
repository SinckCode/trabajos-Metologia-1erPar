import java.util.Scanner;

public class CalculoAhorro51 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int i;
        float cantAno = 0;
        float[] cantMeses = new float[12]; // Arreglo para almacenar los ahorros de cada mes

        for (i = 0; i < 12; i++) {
            System.out.println("Escribe la cantidad a ahorrar del mes " + salidaMes(i));
            cantMeses[i] = consola.nextFloat();
            cantAno += cantMeses[i];
        }

        System.out.println("La cantidad total ahorrada al ano es de: " + cantAno);

        for (i = 0; i < 12; i++) {
            System.out.println(salidaMes(i) + " = " + cantMeses[i]); // Imprimir el ahorro de cada mes
        }
    }

    public static String salidaMes(int i) {
        String[] meses = {
            "ENERO", "FEBRERO", "MARZO", "ABRIL",
            "MAYO", "JUNIO", "JULIO", "AGOSTO",
            "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"
        };
        if (i >= 0 && i < meses.length) {
            return meses[i];
        } else {
            return "Mes no válido";
        }
    }
}
