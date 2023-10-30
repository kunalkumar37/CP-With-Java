import java.util.*;

public class WeightliftingCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int maxStrength = 0;
        int totalEndurance = 0;

        for (int i = 0; i < n; i++) {
            int strength = sc.nextInt();
            int endurance = sc.nextInt();
            maxStrength = Math.max(maxStrength, strength);
            totalEndurance += endurance;
        }

        // Initialize the minimum weight as maxStrength
        int minWeight = maxStrength;

        // Check if Polycarp can win by incrementing the weight
        while (true) {
            int maxLifts = 0;
            for (int i = 0; i < n; i++) {
                int lifts = Math.min(maxStrength, totalEndurance - maxStrength);
                if (lifts < 0) {
                    lifts = 0;
                }
                maxLifts += lifts;
            }

            if (maxLifts > totalEndurance) {
                // Polycarp can win with weight minWeight
                System.out.println(minWeight);
                return;
            }

            // Increment the weight and try again
            minWeight++;
        }
    }
}
