import java.util.*;
public class Two_Frogs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int distance = Math.abs(a - b);

        // If the distance is even, Alice can always force Bob into a losing position
        if (distance % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        
        }
    }
}
