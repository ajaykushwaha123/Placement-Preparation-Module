class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ;i < nums.length; i++){
            int rem = target - nums[i];
            if(mp.containsKey(rem)){
                int[]arr = {mp.get(rem),i};
                return arr;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return null;
    }
}