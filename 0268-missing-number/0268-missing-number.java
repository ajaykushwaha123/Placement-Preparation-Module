class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1) / 2;
        int sum1 = 0;
        for(int i = 0;i < n; i++){
          sum1 = sum1 + nums[i];
        }
        return sum-sum1;
    }
}