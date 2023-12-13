class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++) {
            sum+=nums[j];
            while(sum>=target) {
                len = Math.min(len,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}