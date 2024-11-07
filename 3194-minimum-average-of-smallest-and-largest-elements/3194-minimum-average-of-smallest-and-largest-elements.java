class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            double avg =((double)nums[i]+nums[j])/2;
            min = Math.min(min,avg);
            i++;
            j--;
        }
        return min;
        
    }
}