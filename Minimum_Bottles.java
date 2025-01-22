import java.util.*;
public class Minimum_Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
       
        if(sum<=x){
            System.out.println(1);
            
        }
        else{
             int ans=sum/x;
             if(sum%x==0){
                 System.out.println(ans);
             }
             else{
                 System.out.println(ans+1);
             }
             
        }
       
        

    }
}
