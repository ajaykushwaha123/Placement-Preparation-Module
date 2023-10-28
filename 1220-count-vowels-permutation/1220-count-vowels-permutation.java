class Solution {
    private static final long mod = 1000_000_007;
    public int countVowelPermutation(int n) {
        long dp[] = new long[5];
        for(int i =0; i < 5; i++){
            dp[i] = 1;
        }
        for(int i =1;i < n; i++){
            long next[] = new long[5];
            next[0] = (dp[1]+dp[2]+dp[4])%mod;
            next[1] = (dp[0]+ dp[2])%mod;
            next[2] = (dp[1] + dp[3]) % mod;
            next[3] = dp[2];
            next[4] = (dp[2] + dp[3])%mod;
            dp = next;
        }
        long ans = 0;
        for(int i =0; i<5;i++){
            ans += dp[i];
        }
        ans %= mod;
        return (int)ans;
    }
}