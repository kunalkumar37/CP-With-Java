import java.util.*;
public class KTH_PERMUTATION_SEQUENCE{
    public static void main(String args[]){
        int n=3,k=3;
        String ans=getpermutation(n,k);
        System.out.println("The kth permutation is"+ans);
    }

    public static String getpermutation(int n, int k){
        String s="";
        ArrayList<String>res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            s+=i;
        }
        permutationhelper(s.toCharArray(),0,res);
        Collections.sort(res);
        return res.get(k);

    }

    public static void swap(char s[],int i, int j){
        char ch=s[i];
        s[i]=s[j];
        s[j]=ch;
    }
    public static void permutationhelper(char s[],int index, ArrayList<String>res){
        if(index==s.length){
            String str=new String(s);
            res.add(str);
            return;
        }
        for(int i=index;i<s.length;i++){
            swap(s,i, index);
            permutationhelper(s,index+1,res);
            swap(s,i,index);
            
        }
    }
}