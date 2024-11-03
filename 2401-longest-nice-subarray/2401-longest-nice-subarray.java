class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 1;

        for(int i = 0; i < nums.length - maxLen; i++) {
            int currLen = 1;
            int subarrayOR = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if ((subarrayOR & nums[j]) == 0) {
                    subarrayOR |= nums[j];
                    currLen++;
                }

                else break;
            }

            maxLen = Math.max(maxLen, currLen);
        }
         return maxLen;
    }
}