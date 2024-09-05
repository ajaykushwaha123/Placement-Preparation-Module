class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        for(int i = 2 ;i <= 32 ; i++){
            if(Math.pow(2,i)==n && Math.pow(2,i) <= n){
                return true;
            }
        }
        return false;
    }
}