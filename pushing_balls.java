import java.util.Scanner;

public class pushing_balls {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] grid = new char[n][m];
            
            // Read the grid
            for (int i = 0; i < n; i++) {
                String line = sc.next();
                grid[i] = line.toCharArray();
            }
            
            if (canAchieveState(grid, n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
    
    static boolean canAchieveState(char[][] grid, int n, int m) {
        // Count balls in each row and column
        int[] rowCount = new int[n];
        int[] colCount = new int[m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int gh=1;
        int gh1=1;
        
        
        // Check each row
        for (int i = 0; i < n; i++) {
            if (rowCount[i] > 0) {
                // Find rightmost ball
                int rightmost = -1;
                for (int j = m - 1; j >= 0; j--) {
                    if (grid[i][j] == '1') {
                        rightmost = j;
                        break;
                    }
                }
                // Check if all positions left of rightmost are filled
                for (int j = rightmost - 1; j >= 0; j--) {
                    if (grid[i][j] != '1' && rowCount[i] > rightmost + 1) {
                        gh=0; // Gap found when there are balls to the right
                    }
                }
            }
        }
        
        // Check each column
        for (int j = 0; j < m; j++) {
            if (colCount[j] > 0) {
                // Find bottommost ball
                int bottommost = -1;
                for (int i = n - 1; i >= 0; i--) {
                    if (grid[i][j] == '1') {
                        bottommost = i;
                        break;
                    }
                }
                // Check if all positions above bottommost are filled
                for (int i = bottommost - 1; i >= 0; i--) {
                    if (grid[i][j] != '1' && colCount[j] > bottommost + 1) {
                       gh1=0; // Gap found when there are balls below
                    }
                }
            }
        }
        if(gh ==0 && gh1==0){
            return false;
            
        }
        return true;
    }
}
