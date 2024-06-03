import java.util.Scanner;

public class MenoresYmayores {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        //SE USA EL CICLO FOR
        System.out.println("USO DEL CICLO FOR");
        System.out.println("Cuantos numeros vamos a valorar?");
        int cantidad = consola.nextInt();
        double numero;
        String menorOMayor;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("______________");
            System.out.println("Escribe el valor del numero " + (i + 1));
            numero = consola.nextDouble();

            if (numero < 0) {
                menorOMayor = "Menor";
            } else {
                menorOMayor = "Mayor";
            }

            System.out.println("El numero " + numero + " es " + menorOMayor + " que cero.");
            System.out.println("______________");
        }
        //SE USA EL CICLO FOR
        System.out.println("USO DEL CICLO WHILE");
        //REINICIAMOS VALORES
        
        int i = 0;
        
        while (i < cantidad) {            
            System.out.println("______________");
            System.out.println("Escribe el valor del numero " + (i + 1));
            numero = consola.nextDouble();

            if (numero < 0) {
                menorOMayor = "Menor";
            } else {
                menorOMayor = "Mayor";
            }

            System.out.println("El numero " + numero + " es " + menorOMayor + " que cero.");
            System.out.println("______________");
            
            i++;
        }
        
        //SE USA EL CICLO FOR
        System.out.println("USO DEL CICLO DO-WHILE");
        //REINICIAMOS VALORES
        
        i = 0;
        
        do {
            System.out.println("______________");
            System.out.println("Escribe el valor del numero " + (i + 1));
            numero = consola.nextDouble();

            if (numero < 0) {
                menorOMayor = "Menor";
            } else {
                menorOMayor = "Mayor";
            }

            System.out.println("El numero " + numero + " es " + menorOMayor + " que cero.");
            System.out.println("______________");
            
            i++;
        } while (i < cantidad);
    }
}
