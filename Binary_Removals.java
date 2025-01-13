import java.util.*;

public class Binary_Removals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }   
    public static void solve(Scanner sc){
        int N,X,K;
        N=sc.nextInt();
        X=sc.nextInt();
        K=sc.nextInt();
        String s=sc.next();
        int ans=0;
        while(!s.isEmpty()){
            String subsequence=findvalidsubsequence(s,X,K);
            if(subsequence.isEmpty()){
                break;
            }
            ans++;
            s=removesubsequence(s,subsequence);
        }
        System.out.println(ans);

    }

    private static String findvalidsubsequence(String s, int X, int K){
        int n=s.length();
        for(int len=1;len<=n;len++){
            for(int i=0;i<n-len;i++){
                String subseq=s.substring(i,i+len);
                int inversions=countInversions(subseq);
                if(inversions<=X && inversions%K==0){
                    return subseq;
                }
            }
        }
        return "";

    }

    private static int countInversions(String s){
        int inversions=0;
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ones++;
            }
            else{
                inversions+=ones;
            }
        }
        return inversions;

    }

    private static String removesubsequence(String s, String subsequence){
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray()){
            if(i<subsequence.length() && c==subsequence.charAt(i)){
                i++;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
