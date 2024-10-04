class Solution {
    int dp[][],n;
    public int countArrangement(int _n) {
        n=_n;
        if(n<=1) return n;
        dp=new int[n+1][1<<(n+1)];
        for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);
        return rec(1,0);
    }
    public int rec(int place,int state)
    {
        if(place==n+1)
        {
            return 1;
        }
        if(dp[place][state]!=-1) return dp[place][state];
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if((state & (1<<i))==0 && (i%place==0 || place%i==0))
            {
                ans+=rec(place+1,state|(1<<i));
            }
        }
        return dp[place][state]=ans;
    }
}