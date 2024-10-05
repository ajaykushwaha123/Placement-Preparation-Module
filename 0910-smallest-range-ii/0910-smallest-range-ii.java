class Solution {
    public int smallestRangeII(int[] n, int k) {
        Arrays.sort(n);
    int p=n.length,s=n[p-1]-n[0];
    if(p==1)
        return 0;
    for(int i=0;i<p-1;i++)
    {
        int a=Math.min(n[0]+k , n[i+1]-k);
        int b=Math.max(n[p-1]-k , n[i]+k);
        s=Math.min(s,b-a);
    }
    return s;
    }
}