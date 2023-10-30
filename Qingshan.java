import java.util.*;

public class Qingshan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
    public static boolean ok(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void solve(Scanner sc) {
       String s,t;
       int l1,l2;
       l1=sc.nextInt();
       l2=sc.nextInt();
       s=sc.next();
       t=sc.next();
       if(ok(s)){
        System.out.println("YES");
        return;

       }
//|| t.charAt(0)!=t.charAt(t.length()-1)
       if(!ok(t) || t.charAt(0)!=t.charAt(t.length()-1)){
        System.out.println("NO");
        return;

       }

       boolean zz=false;
       boolean oo=false;

       for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            if(s.charAt(i)=='0'){
                zz=true;

            }
            if(s.charAt(i)=='1'){
                oo=true;
            }
        }

        if(zz && t.charAt(0)=='0'){
            System.out.println("No");
            return;

        }
        if(oo && t.charAt(0)=='1'){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        return;

       }
    }
}
