class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int value = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int a = nums[i];
            while(a > 0){
                value += a % 10;
                a = a/10;
            }
        }
        return Math.abs(sum-value);
    }
}