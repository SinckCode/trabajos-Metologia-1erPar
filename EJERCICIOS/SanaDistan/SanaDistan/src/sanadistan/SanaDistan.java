import java.util.*;

public class SanaDistan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numm = scanner.nextInt();
        for (int i = 0; i < numm; i++) {
            int numeros = scanner.nextInt();
            
            
            if (numeros == numeros) {
                contador++;
            }
        }
        
        System.out.println(contador);
           
    }
}
