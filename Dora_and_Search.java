import java.util.*;

public class Dora_and_Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);

        }
    }

    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int l=0,r=n-1;
        int mn=1,mx=n;
        while(l<=r){
            if(arr[l]==mn){
                l++;
                mn++;

            }
            else if(arr[l]==mx){
                l++;
                mx--;

            }
            else if(arr[r]==mn){
                r--;
                mn++;

            }
            else if(arr[r]==mx){
                r--;
                mx--;

            }
            else {
                break;
            }
        }

        if(l<=r){
            System.out.println((l+1)+" "+(r+1));

        }
        else{
            System.out.println("-1");
        }

    }
}