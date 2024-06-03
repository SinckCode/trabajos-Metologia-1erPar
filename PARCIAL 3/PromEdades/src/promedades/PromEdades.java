import java.util.Scanner;

public class PromEdades {
    public static void main(String[] args) {
     Scanner lector=new Scanner(System.in);
     int[] edades;
     System.out.println("Introduce la cantidad de alumnos:");
     int n=lector.nextInt();
     edades=new int[n];
     double prom=0;
     leerEdades(edades,n);
     prom=calcularPromedio(edades,n);
     imprimir(edades, n, prom);
    
    }
     //lectura de edades
    public static void leerEdades(int edades[],int n){
      Scanner lector=new Scanner(System.in);
      for(int i=0;i<n;i++){
         System.out.println("Introduce la edad del alumno " +(i+1));
         edades[i]=lector.nextInt();
     }
    }//
   
    
     //promedio de las edades
    public static double calcularPromedio(int e[],int n){ 
        int suma=0;
        double prom;
        for(int i=0;i<n;i++){
         suma+=e[i];
         }
        prom=(double)suma/n;
        return prom;
    }// fin de calcularPromedio
     //imprimir elementos del arreglo 
    public static void imprimir(int edades[], int n, double prom){
     for(int i=0;i<n;i++){
         System.out.print(edades[i] + ",  ");
     }
        System.out.println("Promedio de edad: " + prom);
    }//fin de método

 

}//fin de clase
