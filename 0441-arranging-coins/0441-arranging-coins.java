class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int val = n;
        //int result = 0;
        for(int i = 1; i <= n; i++){
            val = val-i;
            if(val < 0){
               val = i-1;
                break;
            }
           
        }
        return val;
    }
}