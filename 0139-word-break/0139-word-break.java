class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
           boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String currentWord = s.substring(j, i);
                dp[i] = dp[j] && wordDict.contains(currentWord);
                if (dp[i]) {
                    break;
                }
            }
        }
        
        return dp[s.length()];
    }
}