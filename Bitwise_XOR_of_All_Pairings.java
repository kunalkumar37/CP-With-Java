import java.util.*;

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int y=n*m;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans.add(nums1[i]^nums2[j]);

            }
        }
        int gt=0;
       for(int z=1;z<ans.size();z++){
            gt=gt^ans.get(z);

       }
       return gt;
    }
}
