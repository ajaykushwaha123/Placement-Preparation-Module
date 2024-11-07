class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        HashSet<Float> set = new HashSet<>();
        while(i < j){
           set.add((float) (nums[i] + nums[j])/2);
            i++;
            j--;
        }
        return set.size();
        
    }
}