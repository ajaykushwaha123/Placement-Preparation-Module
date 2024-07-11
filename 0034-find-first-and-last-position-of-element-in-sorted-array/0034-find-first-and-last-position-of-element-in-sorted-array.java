class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=-1;
        result[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                result[1]=i;
                break;
            }
        }
        return result;
    }
}