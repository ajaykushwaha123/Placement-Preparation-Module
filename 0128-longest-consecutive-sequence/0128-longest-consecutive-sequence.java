class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i < nums.length; i++){
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(Integer ele : set){
            int prevEl = ele - 1;
            if(!set.contains(prevEl)){
                int len = 1;
                int nextEl = ele + 1;
                while(set.contains(nextEl)){
                    len++;
                    nextEl++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}