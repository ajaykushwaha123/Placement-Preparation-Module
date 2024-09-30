class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;  
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> uniquePairs = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num - k)) {
                uniquePairs.add(num - k);
            }
            if (seen.contains(num + k)) {
                uniquePairs.add(num);
            }
            seen.add(num);
        }

        return uniquePairs.size();
        
    }
}