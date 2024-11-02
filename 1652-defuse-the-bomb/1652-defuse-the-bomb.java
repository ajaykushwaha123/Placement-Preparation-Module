class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        if(k > 0){
            int window = 0;
            for(int j = 1; j <= k; ++j) window += code[(j) % n];
            int[] ans = new int[code.length];
            ans[0] = window;
            for(int i = 1; i < n; ++i)
                ans[i] = ans[i - 1] - code[i] + code[(i + k) % n];
            return ans;
        }
        if(k < 0){
            int window = 0;
            int[] ans = new int[n];
            for(int i = k; i < 0; ++i) window += code[(i + n) % n];
            ans[0] = window;
            for(int i = 1; i < n; ++i)
                ans[i] = ans[i - 1] + code[i - 1] - code[(n + i + k - 1) % n];
            return ans;
        }
        return new int[n];
    }
}