class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int dp1 = 1;
        int dp2 = s.charAt(0) == '0'? 0:1;
        for(int i = 2; i <= s.length(); i++){
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));
            int dp = 0;
            if(first >= 1 && first <= 9){
                dp += dp1;
            }
            if(second >= 10 && second <= 26){
                dp += dp2;
            }
            dp2 = dp1;
            dp1 = dp;
            
        }
        return dp1;
    }
}