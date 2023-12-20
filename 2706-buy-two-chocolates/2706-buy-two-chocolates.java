class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if((prices[0]+prices[1]) > money){
            return money;
        }
        int num = Math.abs((prices[0]+prices[1]) - money);
        return num;
    }
}