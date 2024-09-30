class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != arr[i]){
                start = i;
                break;
            }
            if(i == nums.length-1){
                return 0;
            }
        }
        for(int j = nums.length-1; j >=0; j--){
            if(nums[j] != arr[j]){
                end = j;
                break;
            }
        }
        return end - start + 1;
    }
}