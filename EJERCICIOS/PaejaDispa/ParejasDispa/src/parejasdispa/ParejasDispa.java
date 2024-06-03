import java.util.Scanner;

public class ParejasDispa {

    public static int suma(int n) {
        int s = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }

    public static int tipo(int m, int n) {
        int sm = suma(m);
        int sn = suma(n);

        if (sm == n && sn == m) {
            return 0;
        }

        if (sm <= n && sn <= m) {
            return 1;
        }

        if (sm >= n && sn >= m) {
            return 2;
        }

        return 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.printf("%d %d %d\n", tipo(m, n), tipo(m, m), tipo(n, n));

        scanner.close();
    }
}
