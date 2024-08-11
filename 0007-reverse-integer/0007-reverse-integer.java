class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        long rev = 0;
        while(x!=0){
            int temp = x % 10;
            rev = rev * 10 + temp;
            x = x/10;
        }
        if(rev > Integer.MAX_VALUE ||   rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
}