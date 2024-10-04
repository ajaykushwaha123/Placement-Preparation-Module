class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        for(int i = 0; i<nums.length;i++){
            int b = -1*(nums[0] - nums[i]);
            a = a+b;
        }
        return a;
    }
}