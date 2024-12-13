import java.util.*;

public class Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Consume newline
        String x = sc.nextLine();
        String s = sc.nextLine();
        
        for (int i = 0; i <= 5; i++) {
            if (x.contains(s)) {
                System.out.println(i);
                return;
            }
            x = x + x;
        }
        System.out.println("-1");
    }
}