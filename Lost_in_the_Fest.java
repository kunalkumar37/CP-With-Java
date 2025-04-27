import java.util.*;
public class Lost_in_the_Fest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);

        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=arr[n-1]){
                System.out.println((n-1)-i);
                break;
                
            }
        }
    }
}
