import java.util.*;

public class Make_Almost_Equal_With_Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0) {
            solve(sc);
        }
    }
    
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        long a = 2;
        while(true) {
            Set<Long> unique1 = new HashSet<>();
            
            for(int i = 0; i < n; i++) {
                unique1.add(arr[i] % a);
            }
            
            if(unique1.size() == 2) {
                System.out.println(a);
                break;
            }
            
            a *= 2;
        }
    }
}