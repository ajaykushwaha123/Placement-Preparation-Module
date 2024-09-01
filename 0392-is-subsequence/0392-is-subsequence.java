class Solution {
    public boolean isSubsequence(String s, String t) {
        int r = s.length();
        int c = t.length();
        int[][] dp = new int[r+1][c+1];
        for(int i =0;i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j =0;j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return r == dp[r][c];
    }
}