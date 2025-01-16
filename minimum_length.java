import java.util.*;


class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer>charfreq=new HashMap<>();
        for(char c:s.toCharArray()){
            charfreq.put(c,charfreq.getOrDefault(c,0)+1);
        }

        int deletecount=0;
        for(int freq:charfreq.values()){
            if(freq%2==1){
                deletecount+=freq-1;
            }
            else{
                deletecount+=freq-2;

            }
        }
        return s.length()-deletecount;
    }
}