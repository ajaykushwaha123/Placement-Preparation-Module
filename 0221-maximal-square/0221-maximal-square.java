class Solution {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        if(r==0){
            return 0;
        }
        int[][] dp = new int[r+1][c+1];
        for(int i =0 ;i <= r; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= c; j++){
            dp[0][j] = 0;
        }
        int result = 0;
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(matrix[i-1][j-1]=='1'){
                dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    if(result < dp[i][j])
                        result = dp[i][j];
                }
            }
        }
        return result * result;
    }
}