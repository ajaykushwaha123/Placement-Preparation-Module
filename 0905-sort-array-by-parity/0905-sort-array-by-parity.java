class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j =0;
        int k = nums.length-1;
        int[]arr = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                arr[j] = nums[i];
                j++;
            }else{
                arr[k] = nums[i];
                k--;
                
            }
        }
        return arr;
    }
}