import java.io.*;
import java.util.*;

public class Playing_in_a_Casino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            
            // Process each column independently
            long totalSum = 0;
            int[][] matrix = new int[n][m];
            
            // Read the matrix
            for (int i = 0; i < n; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(row[j]);
                }
            }
            
            // Process each column
            for (int j = 0; j < m; j++) {
                int[] column = new int[n];
                for (int i = 0; i < n; i++) {
                    column[i] = matrix[i][j];
                }
                
                // Sort the column
                Arrays.sort(column);
                
                // Calculate sum using prefix sum approach
                long prefixSum = 0;
                for (int i = 0; i < n; i++) {
                    totalSum += (long) column[i] * i - prefixSum;
                    prefixSum += column[i];
                }
            }
            
            System.out.println(totalSum);
        }
    }
}
