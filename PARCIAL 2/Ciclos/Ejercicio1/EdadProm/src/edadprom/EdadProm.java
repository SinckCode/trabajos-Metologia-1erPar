
import java.util.Scanner;

public class EdadProm {

    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe la cantidad de ninos");
        int ninos = consola.nextInt();
        int sumaEdades = 0;
        int edad;
        double promedio;
        
        for (int i = 0; i < ninos; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edad = consola.nextInt();
            sumaEdades += edad;
        }
        
        
        // Calcular el promedio
        promedio = (double) sumaEdades / ninos;
        System.out.println("La edad promedio de los " + ninos + " alumnos es: " + promedio);
        
        //CICLO WHILE
        System.out.println("AHORA CON CICLO WHILE");
        //Reiniciamos variables
        int i = 0;
        sumaEdades = 0;
        while (i < ninos) {            
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edad = consola.nextInt();
            sumaEdades += edad;
            i++;
        }
        
        // Calcular el promedio
        promedio = (double) sumaEdades / ninos;
        System.out.println("La edad promedio de los " + ninos + " alumnos es: " + promedio);
        
        //CICLO DO-WHILE
        //Reiniciamos variables
        i = 0;
        sumaEdades = 0;
        System.out.println("AHORA CON CICLO DO-WHILE");

        do {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edad = consola.nextInt();
            sumaEdades += edad;
            i++;
        } while (i < ninos);
        
        promedio = (double) sumaEdades / ninos;
        System.out.println("La edad promedio de los " + ninos + " alumnos es: " + promedio);
    }
}
