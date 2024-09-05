class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        for(int i = 1 ;i <= 32 ; i++){
            if(Math.pow(4,i)==n){
                return true;
            }
        }
        return false;
    }
}