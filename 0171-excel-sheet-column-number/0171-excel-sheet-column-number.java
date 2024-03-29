class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int pow = 0;
        int n = columnTitle.length();
        for(int i = n -1; i>=0; i--){
            int temp = columnTitle.charAt(i) - 64;
            sum = sum + (int) Math.pow(26,pow++) * temp;
        }
        return sum;
    }
}