import java.util.*;

public class Make_K_Most_Frequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(minOperationsToMakeKMostFrequent(n, k, a));
        }
    }

    public static int minOperationsToMakeKMostFrequent(int n, int k, int[] a) {
        // Count the frequency of each element
        int[] freq = new int[21]; // Since 1 <= K, Ai <= 20
        for (int num : a) {
            freq[num]++;
        }

        // If K is already the most frequent element
        int maxFreq = 0;
        for (int i = 1; i <= 20; i++) {
            if (i != k) {
                maxFreq = Math.max(maxFreq, freq[i]);
            }
        }
        if (freq[k] > maxFreq) {
            return 0;
        }

        // Calculate the minimum number of operations
        int minOperations = Integer.MAX_VALUE;
        int currentFreq = freq[k];

        // Try removing elements from the prefix
        int prefixFreq = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                currentFreq--;
            } else {
                prefixFreq++;
            }
            if (currentFreq > maxFreq) {
                minOperations = Math.min(minOperations, prefixFreq);
                break;
            }
        }

        // Try removing elements from the suffix
        currentFreq = freq[k];
        int suffixFreq = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == k) {
                currentFreq--;
            } else {
                suffixFreq++;
            }
            if (currentFreq > maxFreq) {
                minOperations = Math.min(minOperations, suffixFreq);
                break;
            }
        }

        return minOperations == Integer.MAX_VALUE ? 0 : minOperations;
    }
}
