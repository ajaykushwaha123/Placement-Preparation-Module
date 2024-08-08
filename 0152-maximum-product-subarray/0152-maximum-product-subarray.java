class Solution {
    public int maxProduct(int[] nums) {
        double leftP = 1;
        double rightP = 1;
        double ans = nums[0];
        for(int i = 0 ; i < nums.length; i++){
            if(leftP == 0){
                leftP = 1;
            }
            if(rightP == 0){
                rightP = 1;
            }
            leftP *= nums[i];
            rightP *= nums[nums.length-i-1];
            ans = Math.max(ans,Math.max(leftP,rightP));
        }
        return (int)ans;
    }
}