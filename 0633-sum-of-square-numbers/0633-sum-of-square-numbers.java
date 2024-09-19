class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long)Math.sqrt(c);
        while(l <= r){
            long num = l*l + r*r;
            if(num == c){
                return true;
            }
            else if(num > c){
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}