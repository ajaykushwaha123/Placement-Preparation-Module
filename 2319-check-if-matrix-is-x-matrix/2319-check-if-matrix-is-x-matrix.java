class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid.length; j++){
                if(j==i || j == grid.length - i - 1){
                    if(grid[i][j] == 0)
                        return false;
                    
                }
                else{
                    if(grid[i][j] != 0)
                        return false;
                    
                }
            }
        }
        return true;
    }
}