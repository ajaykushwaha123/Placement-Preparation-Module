class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n/2;
        int sum = 0;
        int j = mid-1;
        int maxSum = 0;
        for(int i = mid; i < n; i++){
            sum = nums[i]+ nums[j];
            j--;
        
        if(maxSum < sum){
            maxSum = sum;
            sum =0;
        }
        }
        
        return maxSum;
    }
}