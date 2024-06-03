
import java.util.Scanner;

public class EstaProm {

    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe la cantidad de miembros");
        int miembros = consola.nextInt();
        int sumaEstaturas = 0;
        double prom;

        for (int i = 0; i < miembros; i++) {
            System.out.println("Escribe la estuatura del miembro " + (i + 1));
            int estatura = consola.nextInt();
            if (estatura > 0) {

                sumaEstaturas += estatura;

            } else {
                System.out.println("DEBES ESCRIBIR LAS ESTATURAS");
                i = miembros + 1;
            }
        }

        // Calcular el promedio
        prom = (double) sumaEstaturas / miembros;
        System.out.println("La estatura promedio de las " + miembros + " personas es: " + prom);

        
        
        
        System.out.println("USO DEL WHILE"); 
        //REINICIAMOS VARIABLES
        sumaEstaturas = 0;
        int i = 0;
        
        
        while (i < miembros) {            
            System.out.println("Escribe la estuatura del miembro " + (i + 1));
            int estatura = consola.nextInt();
            if (estatura > 0) {

                sumaEstaturas += estatura;

            } else {
                System.out.println("DEBES ESCRIBIR LAS ESTATURAS");
                i = miembros + 1;
            }
            i++;
        }
        
       // Calcular el promedio
        prom = (double) sumaEstaturas / miembros;
        System.out.println("La estatura promedio de las " + miembros + " personas es: " + prom);
        
        
        
        System.out.println("USO DEL DO-WHILE");
        //REINICIAMOS VARIABLES
        sumaEstaturas = 0;
        i = 0;
        
        do{
            System.out.println("Escribe la estuatura del miembro " + (i + 1));
            int estatura = consola.nextInt();
            if (estatura > 0) {

                sumaEstaturas += estatura;

            } else {
                System.out.println("DEBES ESCRIBIR LAS ESTATURAS");
                i = miembros + 1;
            }
            i++;
        }while(i < miembros);
        
        // Calcular el promedio
        prom = (double) sumaEstaturas / miembros;
        System.out.println("La estatura promedio de las " + miembros + " personas es: " + prom);
        
    }
}
