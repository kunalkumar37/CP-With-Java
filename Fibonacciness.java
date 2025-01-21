import java.util.*;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a4 = sc.nextInt();
        int a5 = sc.nextInt();

        int maxFibonacciness = 0;

        // Check for a3 = a4 - a2
        int a3 = a4 - a2;
        int fibonacciness = 0;
        if (a4 == a2 + a3) fibonacciness++;
        if (a5 == a3 + a4) fibonacciness++;
        maxFibonacciness = Math.max(maxFibonacciness, fibonacciness);

        // Check for a3 = a5 - a4
        a3 = a5 - a4;
        fibonacciness = 0;
        if (a4 == a2 + a3) fibonacciness++;
        if (a5 == a3 + a4) fibonacciness++;
        maxFibonacciness = Math.max(maxFibonacciness, fibonacciness);

        // Check for a3 = a4 - a2 and a3 = a5 - a4
        a3 = a4 - a2;
        fibonacciness = 0;
        if (a4 == a2 + a3) fibonacciness++;
        if (a5 == a3 + a4) fibonacciness++;
        maxFibonacciness = Math.max(maxFibonacciness, fibonacciness);

        System.out.println(maxFibonacciness);
    }
}
