import java.util.*;
public class Print_all_the_subsets {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>>ans=subsetswithdup(arr);
        printAns(ans);

    }

    public static List<List<Integer>>subsetswithdup(int []nums){
        Arrays.sort(nums);
        List<List<Integer>>anslist=new ArrayList<>();
        findsubsets(0,nums,new ArrayList<>(),anslist);
        return anslist;
    }

    public static void findsubsets(int ind,int []nums,List<Integer>ds,List<List<Integer>>anslist){
        anslist.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            findsubsets(i+1, nums, ds, anslist);    
            ds.remove(ds.size()-1);

        }
    }

    static void printAns(List <List<Integer>>  ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(","," "));
    }
}
