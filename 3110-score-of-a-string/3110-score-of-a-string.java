class Solution {
    public int scoreOfString(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        for(int i = 1; i < c.length; i++){
            result += Math.abs(c[i-1]-c[i]);
        }
        return result;
    }
}