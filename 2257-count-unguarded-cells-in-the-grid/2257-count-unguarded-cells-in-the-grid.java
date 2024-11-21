class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int c=0;
        int[][] vis= new int[m][n];
        int[][] grid= new int[m][n];
        for(int[] a: guards) grid[a[0]][a[1]]=1;
        for(int[] a: walls) grid[a[0]][a[1]]=2;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    int cr=i+1, cc=j+1;
                    while(cr<m && grid[cr][j]!=2 && grid[cr][j]!=1){
                        vis[cr][j]=1;
                        cr+=1;
                    }
                    while(cc<n && grid[i][cc]!=2 && grid[i][cc]!=1){
                        vis[i][cc]=1;
                        cc+=1;
                    }
                    cr= i-1;
                    cc=j-1;
                    while(cr>=0 && grid[cr][j]!=2 && grid[cr][j]!=1){
                        vis[cr][j]=1;
                        cr-=1;
                    }
                    while(cc>=0 && grid[i][cc]!=2 && grid[i][cc]!=1){
                        vis[i][cc]=1;
                        cc-=1;
                    }
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n ;j++){
                if(vis[i][j]==0) c+=1;
            }
        }
        return c-guards.length- walls.length;
    }
}