class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))||mp.get(s.charAt(i))<c){
                mp.put(s.charAt(i),i);
                ans=Math.max(ans,i-c+1);
                
            }else{
                c=mp.get(s.charAt(i))+1;
                mp.put(s.charAt(i),i);
                
            }

        }
        return ans;
    }
}