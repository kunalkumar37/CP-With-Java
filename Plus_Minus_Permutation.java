import java.util.*;

public class Plus_Minus_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        // Find least common multiple to avoid double counting
        long lcm = (x * y) / gcd(x, y);

        // Calculate counts of indices divisible by x and y
        long countX = n / x;
        long countY = n / y;
        long countLCM = n / lcm;

        // Adjust counts to remove common indices
        countX -= countLCM;
        countY -= countLCM;

        // Calculate sums
        long positiveSum = calculateMaxSum(n, countX);
        long negativeSum = calculateMinSum(n, countY);

        System.out.println(positiveSum - negativeSum);
    }

    // Calculate sum of largest numbers
    private static long calculateMaxSum(long n, long count) {
        long start = n - count + 1;
        return (start + n) * count / 2;
    }

    // Calculate sum of smallest numbers
    private static long calculateMinSum(long n, long count) {
        return (1 + count) * count / 2;
    }

    // Greatest Common Divisor 
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}