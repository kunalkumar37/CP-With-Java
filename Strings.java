import java.util.*;
public class Strings {
    public static int lengthofsubstring(String s){
        int []lastseen=new int[256];
        for(int i=0;i<256;i++){
            lastseen[i]=-1;

        }

        int maxlength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            char currentchar=s.charAt(end);
            if(lastseen[currentchar]>=start){
                start=lastseen[currentchar]+1;

            }

            lastseen[currentchar]=end;
            maxlength=Math.max(maxlength,end-start+1);

        }
        return maxlength;


    }

    public static void main(String[] args) {
        String fruits[]={"banana","apple","orange","grape"};
        
        Arrays.sort(fruits);
        System.out.println(fruits);


    }
}
