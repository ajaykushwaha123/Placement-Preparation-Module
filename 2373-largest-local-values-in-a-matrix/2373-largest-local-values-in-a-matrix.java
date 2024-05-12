class Solution {
    public int contiguous(int[][]grid,int a, int b){
        int max = Integer.MIN_VALUE;
        for( int i= a; i < a+3; i++){
            for( int j =b; j < b+3; j++){
                max = Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int res[][] = new int[n-2][n-2];
        for(int i = 0; i < n-2; i++){
            for(int j =0; j < n-2; j++){
                res[i][j] = contiguous(grid,i,j);
            }
        }
        return res;
    }
}