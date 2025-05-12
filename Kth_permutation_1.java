import java.util.*;
public class Kth_permutation_1 {
    public static void main(String[] args) {
        int n=3,k=3;
        String ans=getpermutation(n,k);
        System.out.println("The Kth position is"+ans);

    }

    public static String getpermutation(int n,int k){
        int fact=1;
        ArrayList<Integer>numbers=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+""+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        return ans;
    }
}
