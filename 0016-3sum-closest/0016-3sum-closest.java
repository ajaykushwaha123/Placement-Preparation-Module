class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result1 = nums[0] + nums[1] + nums[2];
         int maxSum = Integer.MAX_VALUE;
        for(int i = 0 ;i < nums.length-1; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
           int result = nums[i]+nums[j]+nums[k];
            if(result == target){
                return target;
            }
            else if(result < target){
                j++;
            }
            else{
                k--;
            }
          int diff = Math.abs(result - target);
                if(diff < maxSum ){
                    result1 = result;
                    maxSum = diff;
                }
          }
        }
        return result1;
    }
}