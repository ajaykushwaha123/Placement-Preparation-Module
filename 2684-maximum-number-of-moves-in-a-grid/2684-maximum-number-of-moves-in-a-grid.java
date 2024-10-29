class Solution {
    public int maxMoves(int[][] g) {
        int[][] m=new int[g.length][g[0].length];
        for(int i=0;i<g.length;i++)
        {
            m[i][0]=1;
        }
        int c=0;
        for(int j=1;j<g[0].length;j++)
        {
            for(int i=0;i<g.length;i++)
            {
                if(i-1>=0)
                {
                    if(m[i-1][j-1]==1 && g[i-1][j-1]<g[i][j])
                    {
                        m[i][j]=1;
                        c=j;
                    }
                }
                if(m[i][j-1]==1 && g[i][j-1]<g[i][j])
                {
                    m[i][j]=1;
                        c=j;
                }
                if(i+1<g.length)
                {
                    if(m[i+1][j-1]==1 && g[i+1][j-1]<g[i][j])
                    {
                        m[i][j]=1;
                        c=j;
                    }
                }
            }
        }
        return c;
    }
}