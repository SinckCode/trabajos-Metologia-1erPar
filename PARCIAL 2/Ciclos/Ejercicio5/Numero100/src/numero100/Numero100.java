public class Numero100 {

    public static void main(String[] args) {
        
        System.out.println("CICLO FOR");
        for (int i = 1; i <= 100; i++) {
            
            i = i + 1;
            
            System.out.println(i);
            
        }
        
        System.out.println("WHILE");
        
        int i = 0;
        
        while (i < 100) {            
            i = i + 1;
            i++;
            System.out.println(i);
        }
        
        System.out.println("DO-WHILE");
        i = 0;
        
        do {
            i = i + 1;
            i++;
            System.out.println(i);
        } while (i < 100);
        
    }
}
