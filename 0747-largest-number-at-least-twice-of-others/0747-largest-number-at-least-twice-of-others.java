class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }
            else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        if (2 * secondMax > max) {
            return -1;
        }
        return maxIndex;
    }
}