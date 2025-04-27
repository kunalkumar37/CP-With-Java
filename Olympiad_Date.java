import java.util.*;

public class Olympiad_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    
    public static void solve(Scanner sc) {
        int n = sc.nextInt(); 
        int[] digits = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        
        
        System.out.println(findDateFormation(digits));
    }
    
    public static int findDateFormation(int[] digits) {
        int n = digits.length;
        
        for (int i = 0; i < n; i++) {
            int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count5 = 0;
            
            for (int j = i; j < n; j++) {
                
                if (digits[j] == 0) count0++;
                else if (digits[j] == 1) count1++;
                else if (digits[j] == 2) count2++;
                else if (digits[j] == 3) count3++;
                else if (digits[j] == 5) count5++;
                
              
                if (count0 >= 3 && count1 >= 1 && count2 >= 2 && count3 >= 1 && count5 >= 1) {
                    return j + 1; 
                }
            }
        }
        
       
        return 0;
    }
}