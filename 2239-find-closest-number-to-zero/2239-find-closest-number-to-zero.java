class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0 ;i < nums.length; i++){
            if(Math.abs(nums[i]) < min){
                min = Math.abs(nums[i]);
                ans = nums[i];
            }
            else if(min == Math.abs(nums[i]) && ans < nums[i]){
                ans = nums[i];
            }
        }
        return ans;
        
    }
}