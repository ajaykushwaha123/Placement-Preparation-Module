class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = 0;
        for(int i =0 ;i < nums.length ; i++){
            num = num ^ nums[i];
        }
        return num;
    }
}