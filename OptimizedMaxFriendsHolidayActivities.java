import java.util.*;
import java.io.*;

public class OptimizedMaxFriendsHolidayActivities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Number of days
            int n = scanner.nextInt();
            
            // Read arrays for each activity
            int[] a = new int[n]; // skiing
            int[] b = new int[n]; // movie
            int[] c = new int[n]; // board games
            
            // Input array for skiing
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Input array for movie
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            // Input array for board games
            for (int i = 0; i < n; i++) {
                c[i] = scanner.nextInt();
            }
            
            // Find maximum friends for 3 distinct days
            int maxFriends = findMaxFriends(n, a, b, c);
            
            // Output result for this test case
            System.out.println(maxFriends);
        }
        
        scanner.close();
    }
    
    // Method to find maximum number of friends across 3 distinct days
    private static int findMaxFriends(int n, int[] a, int[] b, int[] c) {
        // Get top 3 indices for each activity
        List<Integer> topA = getTop3Indices(a);
        List<Integer> topB = getTop3Indices(b);
        List<Integer> topC = getTop3Indices(c);
        
        int maxFriends = 0;
        
        // Try all combinations of top indices
        for (int x : topA) {
            for (int y : topB) {
                for (int z : topC) {
                    // Ensure x, y, and z are all different days
                    if (x != y && x != z && y != z) {
                        // Calculate total friends for these 3 days
                        int totalFriends = a[x] + b[y] + c[z];
                        
                        // Update maximum if needed
                        maxFriends = Math.max(maxFriends, totalFriends);
                    }
                }
            }
        }
        
        return maxFriends;
    }
    
    // Method to get indices of top 3 elements
    private static List<Integer> getTop3Indices(int[] arr) {
        // Create a list to store indices of top 3 elements
        List<Integer> topIndices = new ArrayList<>();
        
        // First pass: find the absolute maximum
        int max1 = -1, max2 = -1, max3 = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (max1 == -1 || arr[i] > arr[max1]) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (max2 == -1 || arr[i] > arr[max2]) {
                max3 = max2;
                max2 = i;
            } else if (max3 == -1 || arr[i] > arr[max3]) {
                max3 = i;
            }
        }
        
        // Add top 3 indices
        topIndices.add(max1);
        topIndices.add(max2);
        topIndices.add(max3);
        
        return topIndices;
    }
}