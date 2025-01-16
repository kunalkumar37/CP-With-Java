import java.util.*;

public class Hamming_equivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            System.out.println(canSortByHammingEquivalent(n, p) ? "YES" : "NO");
        }
    }

    public static boolean canSortByHammingEquivalent(int n, int[] p) {
        // Group numbers by the number of set bits
        Map<Integer, List<Integer>> bitGroups = new HashMap<>();
        for (int num : p) {
            int bitCount = Integer.bitCount(num);
            bitGroups.computeIfAbsent(bitCount, k -> new ArrayList<>()).add(num);
        }

        // Sort each group
        for (List<Integer> group : bitGroups.values()) {
            Collections.sort(group);
        }

        // Create a sorted version of the original array
        int[] sortedP = p.clone();
        Arrays.sort(sortedP);

        // Check if we can match the sorted array using the sorted groups
        int index = 0;
        for (int bitCount : bitGroups.keySet()) {
            List<Integer> group = bitGroups.get(bitCount);
            for (int num : group) {
                if (sortedP[index++] != num) {
                    return false;
                }
            }
        }

        return true;
    }
}
