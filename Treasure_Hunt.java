import java.util.*;
public class Treasure_Hunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();

        int ans=x+y;
        if(a%ans==0){
            System.out.println("NO");
        }
        else{
           int rem=a%ans;
           if(rem<x){
               System.out.println("NO");
           }
           else{
                System.out.println("YES");   
           }
          
        }
        
    }
}