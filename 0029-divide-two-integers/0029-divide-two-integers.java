class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean isPositive = (dividend < 0) == (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        long result = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        return isPositive ? (int) result : (int) -result;
    }
}