class Solution {
    public String customSortString(String order, String s) {
        int count[]=new int[26];
        StringBuilder ans=new StringBuilder();

        for(char c:s.toCharArray()){
            count[c-'a']++;
        }

        for(char ch:order.toCharArray()){
            while(count[ch-'a']-- >0){
                ans.append(ch);
            }
        }

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                char c=(char)(i+97);
                ans.append(c);
                count[i]--;
            }
        }
        return ans.toString();
    }
}