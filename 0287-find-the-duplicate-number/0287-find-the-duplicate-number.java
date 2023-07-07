class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                num = nums[i];
            }
            else{
                map.put(nums[i],nums[i]);
            }
        }
        return num;
    }
}