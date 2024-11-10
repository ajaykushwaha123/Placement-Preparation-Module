class Solution {
    private void update(int[] bits, int x, int change) {
        for (int i = 0; i < 32; i++) {
            if ((x >> i & 1) == 1) {
                bits[i] += change;
            }
        }
    }
    
    private int bitsToNum(int[] bits) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] > 0) {
                result |= 1 << i;
            }
        }
        return result;
    }
    
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int result = n + 1;
        int[] bits = new int[32];
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            update(bits, nums[end], 1);
            
            while (start <= end && bitsToNum(bits) >= k) {
                result = Math.min(result, end - start + 1);
                update(bits, nums[start++], -1);
            }
        }
        
        return result != n + 1 ? result : -1;
        
    }
}