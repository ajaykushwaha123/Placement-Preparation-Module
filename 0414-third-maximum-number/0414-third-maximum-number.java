class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> ans = new HashSet();
        for(int i = nums.length -1; i>=0; i--){
            ans.add(nums[i]);
        
        if(ans.size() == 3)
            return nums[i];
            }
        return nums[nums.length - 1];
    }
}