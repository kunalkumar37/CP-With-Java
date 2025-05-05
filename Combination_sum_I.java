import java.util.*;

import javax.sound.midi.Soundbank;
public class Combination_sum_I {
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        List<List<Integer>>ls=combinationsum(arr, target);
        System.out.println("Combinations are::");
        for(int i=0;i<ls.size();i++){
            for(int j=0;j<ls.get(i).size();j++){
                System.out.println(ls.get(i).get(j)+" ");

            }
            System.out.println();
        }
    }

    public static List<List<Integer>>combinationsum(int []cand,int target){
        List<List<Integer>>ans=new ArrayList<>();
        findcombination(0,cand,target,ans,new ArrayList<>());
        return ans;
    }

    public static void findcombination(int ind,int []cand, int target, List<List<Integer>>ans,List<Integer>ds){
        if(ind==cand.length){
            if(target==0)
            ans.add(new ArrayList<>());
            return;
        }

        if(cand[ind]<=target){
            ds.add(cand[ind]);
            findcombination(ind, cand, target-cand[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findcombination(ind+1, cand, target, ans, ds);
       
    }
}
