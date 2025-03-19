import java.util.*;

public class Big_Achiever {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]=new int[n];
        int maxscore=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxscore){
                ans[i]=1;
                maxscore=arr[i];
            }
            else{
                ans[i]=0;

            }
           
            
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


