import java.util.*;

public class Assembly_via_Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            solve(sc);
        }
    }
    
    public static void solve(Scanner sc) {
        int n = sc.nextInt(); // Length of the array a
        int g = (n * (n - 1)) / 2; // Size of array b
        
        // Read the elements of b
        int[] b = new int[g];
        for (int i = 0; i < g; i++) {
            b[i] = sc.nextInt();
        }
        
        // Sort the array b
        Arrays.sort(b);
        
        // The first n-1 smallest elements
        int[] a = new int[n];
        int smallestIndex = 0;
        
        // Fill the first n-1 elements with the smallest values
        for (int i = 0; i < n - 1; i++) {
            a[i] = b[smallestIndex];
            smallestIndex += n - i - 1;
        }
        
        // Find the last element (largest value)
        a[n - 1] = b[g - 1];
        
        // Print the restored array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}