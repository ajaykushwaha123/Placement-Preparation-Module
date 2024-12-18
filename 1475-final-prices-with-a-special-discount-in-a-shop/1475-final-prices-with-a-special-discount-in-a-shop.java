class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        Stack<Integer> s=new Stack<>();
        for(int i=prices.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&prices[s.peek()]>prices[i])
            {
                s.pop();
            }
            ans[i]=s.isEmpty()?0:prices[s.peek()];
            s.push(i);
        }
        for(int i=0;i<prices.length;i++)
        {
            prices[i]-=ans[i];
        }
        return prices;
    }
}