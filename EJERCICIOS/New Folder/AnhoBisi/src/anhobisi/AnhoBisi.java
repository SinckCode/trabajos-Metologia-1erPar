import java.util.Scanner;
import java.time.Year;

public class AnhoBisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorBisiestos = 0;

        // Leer los diez años proporcionados por el usuario y calcular el número de años bisiestos
        for (int i = 0; i < 10; i++) {
            int anho = scanner.nextInt();

            if (Year.isLeap(anho)){
            contadorBisiestos++;
            }
        }
        
       System.out.println(contadorBisiestos);

    }
}