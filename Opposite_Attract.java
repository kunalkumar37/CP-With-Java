import java.util.*;

public class Opposite_Attract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        String s=sc.next();
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                ans+='1';

            }
            else{
                ans+='0';
            }
        }
        System.out.println(ans);

    }
}
