import java.util.Scanner;

public class OFAD_Arreglobi {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double cal[][];
        double promA[];
        double promP[];
        int noAlumnos;
        System.out.println("Introduce el numero de alumnos");
        noAlumnos = lector.nextInt();
        cal = new double [noAlumnos][3];
        promA = new double [noAlumnos];
        promP = new double [3];
        leer( cal);
        obtenerPromedio(cal, promA);
        obtenerPromParcial(cal, promP);
    }
    
  
    
  public static void obtenerPromedio(double cal[][], double prom[]){
      
      for (int r = 0; r < cal.length; r++) {
          double suma = 0;
          for (int c = 0; c < cal[0].length; c++) {
              suma+=cal[r][c];
          }
          prom[r]=suma/cal[0].length;
      }
      
  }  
  
  public static void imprimir (double cal[][], double promA[], double promP[]){
      System.out.println("Nombre \t\t P1 \tP2 \t P3 \t\t Prom");
      for (int r = 0; r < cal.length; r++) {
         // System.out.print("\n"nombres[r]);
          for (int c = 0; c < cal[0].length; c++) {
              System.out.print("\t" + cal[r][c]);
          }
          System.out.print("\t\t" + promA[r]);

      }
      
      for (int c = 0; c < promP.length; c++) {
          System.out.println("\t\t" + promP[c]);
          
      }
  }
  
  public static void obtenerPromParcial(double cal[][], double prom[]){
      for (int c = 0; c < cal[0].length; c++) {
          double suma = 0;
          for (int r = 0; r < cal.length; r++) {
              suma+=cal[r][c];
          }
          prom[c]=suma/cal.length;
      }
  }
  public static void leer(double cal[][]){
      Scanner lector = new Scanner(System.in);
      for (int c = 0; c < cal[0].length; c++) {
          System.out.println("Registro de calificaciones del parcial" + (c+1));
          for (int r = 0; r < cal.length; r++) {
              System.out.println("Introduce la calificación del alumno" + (r+1));
              cal[r][c] = lector.nextDouble();
          }
          }
          
      }
  }


