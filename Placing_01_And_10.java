import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Placing_01_And_10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); 
            }
            
            solve(n, a);
        }
        sc.close();
    }
    
    static void solve(int n, int[] a) {
        List<int[]> operations = new ArrayList<>(); 
        
        int[] curr = a.clone();
        int currLen = n;
        while (currLen > 4) {
            int mex = getMex(curr, 0, 1);
            operations.add(new int[]{1, 2});
            curr = shrinkArray(curr, currLen, 0, 1, mex);
            currLen -= 1; 
        }
        
      
        if (currLen == 4) {
           
            int mex1 = getMex(curr, 0, 1); 
            operations.add(new int[]{1, 2});
            int[] temp1 = shrinkArray(curr, 4, 0, 1, mex1); 
            
            int mex2 = getMex(temp1, 1, 2); 
            operations.add(new int[]{2, 3}); 
            int[] temp2 = shrinkArray(temp1, 3, 1, 2, mex2);
            
            int finalMex = getMex(temp2, 0, 1); 
            operations.add(new int[]{1, 2});
          
        }
        
       
        System.out.println(operations.size());
        for (int[] op : operations) {
            System.out.println(op[0] + " " + op[1]);
        }
    }
    
   
    static int getMex(int[] arr, int l, int r) {
        boolean[] seen = new boolean[arr.length + 1]; 
        for (int i = l; i <= r; i++) {
            if (arr[i] < seen.length) {
                seen[arr[i]] = true;
            }
        }
        for (int x = 0; x < seen.length; x++) {
            if (!seen[x]) {
                return x;
            }
        }
        return seen.length; 
    }
    
    
    static int[] shrinkArray(int[] arr, int len, int l, int r, int mex) {
        int newLen = len - (r - l);
        int[] newArr = new int[newLen];
        for (int i = 0; i < l; i++) {
            newArr[i] = arr[i];
        }
        newArr[l] = mex;
        for (int i = r + 1; i < len; i++) {
            newArr[i - (r - l)] = arr[i];
        }
        return newArr;
    }
}
}
