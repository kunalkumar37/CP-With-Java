import java.util.*;

public class Kevin_and_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int[] arr=new int[n];
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even.add(arr[i]);

            }
            else{
                odd.add(arr[i]);

            }
        }
        int index=0;
        for(int num:even){
            arr[index]=num;
            index++;

        }
        for(int num:odd){
            arr[index]=num;
            index++;

        }

        int s=0;
        int points=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s%2==0){
                points++;
                while(s%2==0){
                    s=s/2;

                }
            }
        }
        System.out.println(points);

    }
}
