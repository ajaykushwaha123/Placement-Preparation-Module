class Solution {
    public int maxTrailingZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        Node[][] rows = new Node[m][n];
        Node[][] cols = new Node[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int five = getFive(grid[i][j]);
                int two = getTwo(grid[i][j]);
                Node nodeR = new Node(five, two);
                Node nodeC = new Node(five, two);
                
                if (i > 0) {
                    nodeC.five = nodeC.five + cols[i - 1][j].five;
                    nodeC.two = nodeC.two + cols[i - 1][j].two;
                }
                
                cols[i][j] = nodeC;
                
                if (j > 0) {
                    nodeR.five = nodeR.five + rows[i][j - 1].five;
                    nodeR.two = nodeR.two + rows[i][j - 1].two;
                }
                
                rows[i][j] = nodeR;
            }
        }
        
        int max = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowLeft5 = j - 1 < 0 ? 0 : rows[i][j - 1].five;
                int rowLeft2 = j - 1 < 0 ? 0 : rows[i][j - 1].two;
                int rowRight5 = rows[i][n - 1].five - rows[i][j].five;
                int rowRight2 = rows[i][n - 1].two - rows[i][j].two;
                
                int colUp5 = i - 1 < 0 ? 0 : cols[i - 1][j].five;
                int colUp2 = i - 1 < 0 ? 0 : cols[i - 1][j].two;
                int colDown5 = cols[m - 1][j].five - cols[i][j].five;
                int colDown2 = cols[m - 1][j].two - cols[i][j].two;
                
                int cur = grid[i][j];
                
                max = Math.max(max, Math.min(rowLeft5 + colUp5 + getFive(cur), rowLeft2 + colUp2 + getTwo(cur)));
                max = Math.max(max, Math.min(rowLeft5 + colDown5 + getFive(cur), rowLeft2 + colDown2 + getTwo(cur)));
                max = Math.max(max, Math.min(rowRight5 + colUp5 + getFive(cur), rowRight2 + colUp2 + getTwo(cur)));
                max = Math.max(max, Math.min(rowRight5 + colDown5 + getFive(cur), rowRight2 + colDown2 + getTwo(cur)));
            }
        }
        
        return max;
    }
    
    private int getTwo(int x) {
        int res = 0;
        
        while (x % 2 == 0) {
            res++;
            x /= 2;
        }
        return res;
    }
    
    private int getFive(int x) {
        int res = 0;
        
        while (x % 5 == 0) {
            res++;
            x /= 5;
        }
        return res;
    }
}

class Node {
    int five;
    int two;
    
    public Node(int five, int two) {
        this.five = five;
        this.two = two;
    }
}