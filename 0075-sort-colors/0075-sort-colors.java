class Solution {
    public void sortColors(int[] nums) {
        // insertion sort
        for(int i = 1; i< nums.length; i++){
            int j = i-1;
            int temp = nums[i];
            while(j >=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
}