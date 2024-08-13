class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String str = "";
        for(int i = s.length()-1; i>=0; --i){
            str += s.charAt(i);
        }
        if(s.toLowerCase().equals(str.toLowerCase())){
            return true;
        }
           else{
               return false;
           }
    }
}