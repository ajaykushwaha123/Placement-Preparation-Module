class Solution {
    public int minSubarray(int[] n, int p) {
        int x=0;
        for(int y:n)x = (x+y%p)%p;
        if(x==0)return 0;

        Map<Integer,Integer> v = new HashMap<>();
        v.put(0, -1);
        int a=n.length, c=0, d, t;
        for(int i=0; i<n.length; i++){
            if(n[i]%p==x)return 1;
            c=(c+n[i]%p)%p;
            d=(c+p-x)%p;
            v.put(c,i);
            if(!v.containsKey(d))continue;
            else{
                t=i-v.get(d);
                if(a>t)a=t;
            }
        }
        return a==n.length? -1:a;
    }
}