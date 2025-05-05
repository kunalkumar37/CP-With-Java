import java.util.*;
public class Combination_sum_II {
    public static void main(String[] args) {
        int v[]={10,1,2,7,6,1,5};
        List<List<Integer>>res=combinationsum2(v,8);
        System.out.println(res.toString().replace(","," "));


    }

    public static List<List<Integer>>combinationsum2(int[]candidate,int target){
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidate);
        findcombination(0, candidate,target,ans,new ArrayList<>());
        return ans;
    }
    
    public static void findcombination(int ind, int []arr, int target, List<List<Integer>>ans, List<Integer>ds){
        if(target==0){
            if(ind==arr.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
        }

        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            findcombination(i+1,arr, target-arr[i],ans, ds);
            ds.remove(ds.size()-1);

        }
    }
}
