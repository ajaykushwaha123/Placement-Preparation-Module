class Solution {
   public int getMaximumGold(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        boolean[][] check=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int sum=wrapper(grid,check,i,j,0);
                    ans=Math.max(ans,sum);
                }
            }
        }

        return ans;
    }
    public int wrapper(int[][] grid,boolean[][] check, int i, int j, int sum){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || check[i][j] || grid[i][j]==0){
            return sum;
        }

        check[i][j]=true;
        sum+=grid[i][j];
        int num1=wrapper(grid,check,i+1,j,sum);
        int num2=wrapper(grid,check,i,j+1,sum);
        int num3=wrapper(grid,check,i-1,j,sum);
        int num4=wrapper(grid,check,i,j-1,sum);
        check[i][j]=false;

        return Math.max(num1,Math.max(num2,Math.max(num3,num4)));

    }
}