import java.util.*;
public class Matryoshkas {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);

        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        Map<Integer,Integer>cnt=new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            cnt.put(arr[i],cnt.getOrDefault(arr[i],0)+1);

        }

        TreeSet<Integer>set=new TreeSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
            set.add(arr[i]+1);

        }

        int last=0;
        int res=0;

        for(int x:set){
            int c=cnt.getOrDefault(x,0);
            res+=Math.max(0,c-last);

            last=c;

        }
        System.out.println(res);
    }
}
