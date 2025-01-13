import java.util.*;

public class Crafting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

    
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

    
        if (canCraft(n, a.clone(), b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canCraft(int n, long[] a, long[] b) {
                boolean needsMore = false;
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                needsMore = true;
                break;
            }
        }
        if (!needsMore) return true;

        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {  
                boolean canPerform = true;
                for (int j = 0; j < n; j++) {
                    if (j != i && a[j] < 1) { 
                        canPerform = false;
                        break;
                    }
                }

                if (canPerform) {
                    long[] newA = a.clone();
                    newA[i]++;  
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            newA[j]--; 
                        }
                    }

                    if (canCraft(n, newA, b)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}