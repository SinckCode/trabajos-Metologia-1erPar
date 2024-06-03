
import java.util.Scanner;

public class ProjectJava {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        int parar = 1;
        
        
        while (parar == 1) {
            System.out.println("BIENVENIDO\n");
            System.out.println("Que vamos a dibujar hoy?");
            System.out.println("FIGURAS\n"
                    + "CUADRADO: 0\n"
                    + "TRIANGULO IZQ SUPERIOR: 1\n"
                    + "TRIANGULO DER SUPERIOR: 2\n"
                    + "TRIANGULO IZQ INFERIOR: 3\n"
                    + "TRIANGULO DER INFERIOR: 4\n"
                    + "ROMBO: 5");
            
            int figura = consola.nextInt();
            
            System.out.println("__________________________");
            System.out.println("De que tamano va a ser la figura?");
            System.out.println("__________________________");
            int n = consola.nextInt();
            
            
            
            switch (figura) {
                case 0: 
                    cuadrado(n);
                    break;
                case 1: 
                    triSupIzq(n);
                    break;
                case 2: 
                    triSupDer(n);
                    break;
                case 3: 
                    triInfIzq(n);
                    break;
                case 4: 
                    triInfDer(n);
                    break;
                case 5:
                    rombo(n);
                    break;
                default:
                    throw new AssertionError();
            }
            
            System.out.println("Quieres hacer otra figura?");
            System.out.println("1 = si 0 = no");
            parar = consola.nextInt();
            
        }

    }

    public static void cuadrado(int n) {
        for (int i = 0; i < n; i++) {

            System.out.println("* ".repeat(n));

        }
    }

    public static void triSupIzq(int n) {
        for (int i = 0; i <= n; i++) {
            int espacio = n - i;

            System.out.println("  ".repeat(espacio) + "* ".repeat(i));
        }

    }

    public static void triSupDer(int n) {
        for (int i = 1; i <= n; i++) {

            System.out.println(" *".repeat(i));

        }
    }

    public static void triInfIzq(int n) {
        for (int i = 0; i <= n; i++) {
            int resta1 = n - i;

            System.out.println(" *".repeat(resta1));

        }
    }

    public static void triInfDer(int n) {
        for (int i = 0; i <= n; i++) {
            int espacio = n - i;

            System.out.println("  ".repeat(i) + "* ".repeat(espacio));
        }

    }

    public static void rombo(int n) {
        // Parte superior del rombo
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");          
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
