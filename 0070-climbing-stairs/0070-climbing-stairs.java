class Solution {
    public int climbStairs(int n) {
        int temp;
        int a = 1;
        int b = 1;
        for(int i = 0; i < n-1; i++){
            temp = a;
            a = a+b;
            b = temp;
        }
        return a;
        
    }
}