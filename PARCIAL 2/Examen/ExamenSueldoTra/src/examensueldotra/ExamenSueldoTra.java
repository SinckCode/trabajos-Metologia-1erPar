import java.util.Scanner;

public class ExamenSueldoTra {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int acomulador = 0; // Variable para acumular los sueldos

        System.out.println("Cuantos trabajadores va a registrar?");
        int trabajadores = consola.nextInt();

        for (int i = 0; i < trabajadores; i++) {
            System.out.println("Cual es tu nombre?");
            String nombre = consola.next();
            System.out.println("Cuanto es lo que ganas");
            int ganas = consola.nextInt();

            // Llama a la función para calcular el sueldo y muestra los resultados
            int[] resultado = calculoTra(ganas);
            int sueldo = resultado[0];
            int descuento = resultado[1];

            salidaDatos(sueldo, nombre, descuento);
            acomulador += sueldo; // Acumula el sueldo
        }

        salidaNomina(acomulador); // Muestra la nómina total
    }

    public static int[] calculoTra(int ganas) {
        int descuento = 0;
        int sueldo = 0;

        if (ganas <= 1500) {
            descuento = (ganas * 5) / 100;
        } else if (ganas <= 3000) {
            descuento = (ganas * 7) / 100;
        } else if (ganas <= 4500) {
            descuento = (ganas * 9) / 100;
        }

        sueldo = ganas - descuento;
        return new int[]{sueldo, descuento};
    }

    public static void salidaDatos(int sueldo, String nombre, int descuento) {
        System.out.println("-------------------");
        System.out.println(nombre + " tu sueldo es " + sueldo + " y tu impuesto fue de " + descuento);
        System.out.println("-------------------");
    }

    public static void salidaNomina(int acomulador) {
        System.out.println("Nomina total es de " + acomulador);
    }
}
