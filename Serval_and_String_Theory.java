import java.util.*;

public class Serval_and_String_Theory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            String s = sc.next();  
            
            if (canMakeUniversal(s, n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
    static boolean canMakeUniversal(String s, int n, int k) {
       
        if (n == 1) {
            return false; 
        }
        boolean allEqual = true;
        char first = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != first) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            return false; 
        }
        
       
        String reverse = new StringBuilder(s).reverse().toString();
        if (s.compareTo(reverse) < 0) {
            return true; 
        }
        
       
        return k >= 1;
    }
}

