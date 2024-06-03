
import java.util.Scanner;

public class Ejercicio1Dibu {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

      

        int n = consola.nextInt();

        for (int i = 0; i < n; i++) {
            

            System.out.println("* ".repeat(n));

        }
        System.out.println("  ");
        for (int i = 1; i <= n; i++) {
            

            System.out.println(" *".repeat(i));

        }
        System.out.println("  ");
        for (int i = 0; i <= n; i++) {
            int resta1 = n - i;
            

            System.out.println(" *".repeat(resta1));

        }
        System.out.println("  ");
        
        for (int i = 0; i <= n; i++) {
            int espacio = n - i;

            System.out.println("  ".repeat(espacio) + "* ".repeat(i));
        }
        
        System.out.println("   ");
        
        for (int i = 0; i <= n; i++) {
            int espacio = n - i;

            System.out.println( "  ".repeat(i)+"* ".repeat(espacio));
        }
        
        
        
   
        
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



