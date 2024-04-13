class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(end < n){
            map.put(nums[end], map.getOrDefault(nums[end],0) +1);
        
        while(map.get(nums[end]) > k){
            map.put(nums[start],map.get(nums[start]) - 1);
            start++;
        }
        maxLen = Math.max(maxLen, end - start + 1);
        end++;
        }
        return maxLen;
    }
}