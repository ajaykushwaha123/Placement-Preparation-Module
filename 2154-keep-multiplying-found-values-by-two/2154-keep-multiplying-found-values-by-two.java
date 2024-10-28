class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length){
            if(original == nums[i]){
                original = nums[i] * 2;
            }
            i++;
        }
        return original;
    }
}