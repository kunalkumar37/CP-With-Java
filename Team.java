import java.util.*:
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);

        }
    }
    public static void solve(Scanner sc){
        int n;
        n=sc.nextInt();
        int x=sc.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        Arrays.sort(a);
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(a[i]>=x){
                count++;

            }
            else{
                int d=a[i];
                

            }

        }
        
    }
}
