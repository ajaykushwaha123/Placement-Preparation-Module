class Solution {
    public int countHomogenous(String s) {
        int sum = 0;
        int result = 0;
        for(int i =0; i < s.length();i++){
            if(i==0 || s.charAt(i) == s.charAt(i-1)){
                sum++;
            }
            else{
                sum = 1;
            }
        
        result = (result + sum) % 1000000007;
        }
        return result;
    }
}