import java.util.*;
public class Scuza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);

        }
    }

    public static void solve(Scanner sc){
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        
        ArrayList<Long>pref=new ArrayList<>();
        pref.add(0L);

        ArrayList<Integer>prefmax=new ArrayList<>();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            pref.add(pref.get(pref.size()-1)+x);

            if(i==0){
                prefmax.add(x);
            }
            else{
                prefmax.add(Math.max(prefmax.get(prefmax.size()-1),x));

            }
        }

        for(int i=0;i<q;i++){
            int k=sc.nextInt();
            int searchresult=Collections.binarySearch(prefmax,k);
            int ind;
            if(searchresult<0){
                ind=-searchresult-1;
            }
            else{
                ind=searchresult;
                while(ind<prefmax.size() && prefmax.get(ind)<=k){
                    ind++;

                }
            }
            System.out.print(pref.get(ind)+" ");

        }
        System.out.println();


    }

}
