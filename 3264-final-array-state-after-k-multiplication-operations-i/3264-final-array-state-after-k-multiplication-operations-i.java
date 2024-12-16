class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if(k == 0){
            return nums;
        }
        int min = nums[0];
        int j = 0;
       
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < min){
                    j = i;
                    min = nums[i];
                    
                }
            }
            nums[j] *= multiplier;
            return getFinalState(nums, k-1, multiplier);
        
    }
}