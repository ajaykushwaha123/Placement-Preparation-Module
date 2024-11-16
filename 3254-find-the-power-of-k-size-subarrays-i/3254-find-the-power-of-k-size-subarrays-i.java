class Solution {
    public int[] resultsArray(int[] nums, int k) {
     int[] arr = new int[nums.length - k + 1];
        int count  = 1;
        for(int i =1 ; i < k ; i++){
            if(nums[i]==nums[i-1] + 1){
                count++;
            }
            else{
                count = 1;
            }
        }
        if(count==k){
            arr[0] = nums[k-1];
        }
        else{
            arr[0] = -1;
        }
        int i = 1;
        int j = k;
        while(j < nums.length){
            if(nums[j]==nums[j-1] + 1){
                count++;
            }
            else{
                count = 1;
            }
            if(count >= k){
                arr[i] = nums[j];
            }
            else{
                arr[i] = -1;
            }
            i++;
            j++;
        }
        return arr;
    }
}