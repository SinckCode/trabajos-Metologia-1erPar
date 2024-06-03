package lpbc_series;
import java.util.Scanner;

public class LPBC_Series_Ante {

     
    
    
    public static void main(String[] args) {
        Serie[] bdSeries= new Serie[3];
        
        for (int i = 0; i < bdSeries.length; i++) {
            bdSeries[i]=leerSerie();
        }
        System.out.println("Titulo Director Productora Genero");
        for (int i = 0; i < bdSeries.length; i++) {
            imprimirIndividual(bdSeries[i]);
        }
        
    }
    
    public static void imprimirIndividual(Serie s1){
        
        System.out.println(s1.nombre+" "+s1.director+" "+s1.productora+" "+s1.genero+" "+s1.fechaLanzamiento+" "+s1.pais+" "+s1.noTemporadas);

    }
    
    public static Serie leerSerie(){
        Scanner lector = new Scanner(System.in);
                
        Serie bdSerie = new Serie();
        
        System.out.println("Introduce el titulo de la serie");
        bdSerie.nombre=lector.next();
        System.out.println("Introduce el nommbre del director");
        bdSerie.director=lector.next();
        System.out.println("Introduce el nombre de la casa productora");
        bdSerie.productora =lector.next();
        System.out.println("Introduce el genero de la serie");
        bdSerie.genero = lector.next();
        System.out.println("Introduce la fecha de lanzamiento");
        bdSerie.fechaLanzamiento = lector.next();
        System.out.println("Introduce el pais de origen de la serie");
        bdSerie.pais = lector.next();
        System.out.println("Introduce el numero de temporadas");
        bdSerie.noTemporadas = lector.nextInt();
        return bdSerie;
        
        
    }
}
 class Serie{
        public String nombre;
        public String genero;
        public String director;
        public String pais;
        public String productora;
        public int noTemporadas;
        public String fechaLanzamiento;
    }