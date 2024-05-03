class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxsum = 0;
        for(int i = 0; i < k; i++){
            sum +=nums[i];
        }
        maxsum = sum;
        for(int i = 1; i < nums.length-k+1; i++){
            sum = sum-nums[i-1]+nums[i+k-1];
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum/k;
    }
}