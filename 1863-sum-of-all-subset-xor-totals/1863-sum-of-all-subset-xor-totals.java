class Solution {
   public int subsetXORSum(int[] nums) {
        return sum(nums, 0, 0);
    }
    public int sum(int[]nums, int i, int xor){
        if(i == nums.length) return xor;
        return sum(nums, i+1, xor ^ nums[i]) + sum(nums, i + 1, xor);
    }
}