class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(i != nums.length - 1) continue;
            }
            if(count > max) max = count;
            count = 0;
        }
        return max;
    }
}