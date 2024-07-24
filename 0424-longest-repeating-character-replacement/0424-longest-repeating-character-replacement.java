class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right =0;
        int maxLen = 0;
        int maxfreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right< s.length()){
            char rightChar = s.charAt(right);
            map.put(rightChar,map.getOrDefault(rightChar,0)+1);
            maxfreq = Math.max(maxfreq,map.get(rightChar));
        if((right-left+1)-maxfreq > k){
            char leftChar = s.charAt(left);
            map.put(leftChar,map.get(leftChar)-1);
            left++;
        }
          maxLen = Math.max(maxLen,right-left+1); 
                               right++;
    }
                               return maxLen;
 }
}