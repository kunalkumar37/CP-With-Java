import java.util.*;
public class Same_Difference {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n = sc.nextInt();
            String s = sc.next();
            
            char last = s.charAt(n - 1);
            int ops = 0;
            
            // Count how many chars (except last) differ from s[n-1]
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != last) {
                    ops++;
                }
            }
            
            System.out.println(ops);
    }
    
}
