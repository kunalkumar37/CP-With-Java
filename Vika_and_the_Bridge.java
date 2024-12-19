import java.util.*;

public class Vika_and_the_Bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        public static void solve(Scanner sc){
            //Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of planks
        int k = sc.nextInt(); // Number of colors
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt(); // Color of each plank
        }

        System.out.println(minimizeMaxStep(n, k, colors));
    }

    public static int minimizeMaxStep(int n, int k, int[] colors) {
        int left = 0, right = n; // Search space for the maximum gap
        int result = n; // Initialize result to the worst case

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canCross(n, k, colors, mid)) {
                result = mid; // If feasible, try a smaller maximum step
                right = mid - 1;
            } else {
                left = mid + 1; // If not feasible, increase the maximum step
            }
        }

        return result;
    }

    // Helper function to check if it's possible to cross the bridge with max step <= maxStep
    private static boolean canCross(int n, int k, int[] colors, int maxStep) {
        // Check for each color
        for (int color = 1; color <= k; color++) {
            List<Integer> positions = new ArrayList<>();

            // Collect positions of the current color
            for (int i = 0; i < n; i++) {
                if (colors[i] == color) {
                    positions.add(i);
                }
            }

            // Try to repaint one plank to this color and check feasibility
            for (int i = 0; i < n; i++) {
                if (colors[i] != color) {
                    // Simulate repainting this plank
                    positions.add(i);
                    Collections.sort(positions);

                    // Check if maxStep is valid for this configuration
                    if (isValid(positions, maxStep, n)) {
                        return true;
                    }

                    // Undo repainting simulation
                    positions.remove(Integer.valueOf(i));
                }
            }

            // Check without repainting
            if (isValid(positions, maxStep, n)) {
                return true;
            }
        }

        return false;
    }

    // Check if the positions allow crossing the bridge with max step <= maxStep
    private static boolean isValid(List<Integer> positions, int maxStep, int n) {
        if (positions.isEmpty()) return false;

        int previous = -1; // Start before the first plank
        for (int pos : positions) {
            if (previous != -1 && pos - previous - 1 > maxStep) {
                return false; // Gap between consecutive planks is too large
            }
            previous = pos;
        }

        // Check the gap between the last plank in the sequence and the end of the bridge
        return (n - positions.get(positions.size() - 1) - 1) <= maxStep;
    }
}
