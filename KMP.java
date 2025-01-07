import java.util.*;

public class KMP {
   static int kmpbrute(String string,String pattern){
    int n=string.length();
    int m=pattern.length();
    for(int i=0;i<n+1-m;i++){
        int j=0;
        while(j<m && string.charAt(i+j)==pattern.charAt(j)){
            j++;
            
        }
        if(j==m){
            return i;

        }
        return -1;

    }
        return m;
   }
   public static void main(String args[]){
    String pattern="aaaaab", string="aaaaab";
    int index=kmpbrute(string,pattern);
    if(index==-1){
        System.out.println("Pattern not found");
    }
    else{
        System.out.println("Pattern found at index "+index);
    }
}
}
