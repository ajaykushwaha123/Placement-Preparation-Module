class Solution {
    public int maxCoins(int[] piles) {
    Arrays.sort(piles);
        int sum = 0;
        int i = piles.length - 2;
        int j = 0;
        while(j++ < piles.length / 3){
            sum += piles[i];
            i = i-2;
        }
        return sum;
    }
}