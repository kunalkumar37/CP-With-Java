import java.util.*;
public class palindrome_partioning {
    public static void main(String[] args) {
        String s="aabb";
        List<List<String>>ans=partition(s);
        int n=ans.size();
        System.out.println("The palindromic partition are::--");
        System.out.println(" [ ");
        for(int i=0;i<ans.size();i++){
            System.out.print("[ ");
            for(int j=0;j<ans.get(i).size();j++){
                System.out.println(ans.get(i).get(j)+" ");
            }
            System.out.print("] ");
        }
        System.out.print("]");
    }

    public static List<List<String>>partition(String s){
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        partitionhelper(0,s,path,res);
        return res;
    }
    public static void partitionhelper(int index,String s, List<String>path, List<List<String>>res){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                partitionhelper(i+1, s, path, res);
                path.remove(path.size()-1);
            }
        }

    }

    public static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
               
                start++;
                end--;
                return false;
            }
        }
        return true;
    }
}
