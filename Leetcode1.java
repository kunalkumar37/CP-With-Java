class Solution {
    public long findScore(int[] nums) {
        long score = 0; // Use long for score
        int n = nums.length;
        boolean[] marked = new boolean[n]; // Track marked elements

        int[] arr1 = Arrays.copyOf(nums, n);
        Arrays.sort(arr1);

        for (int value : arr1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == value && !marked[i]) {
                    score += nums[i];

                    // Mark the current and adjacent elements
                    marked[i] = true;
                    if (i - 1 >= 0) {
                        marked[i - 1] = true;
                    }
                    if (i + 1 < n) {
                        marked[i + 1] = true;
                    }
                }
            }
        }
        return score;
    }
}
