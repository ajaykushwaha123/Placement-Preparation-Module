class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int k = 0;
        int j = word1.length();
        int l = word2.length();
        StringBuilder sb = new StringBuilder();
         while((i < j) || (k < l)){
             if( i < j){
             sb.append(word1.charAt(i));
             }
             if(k < l){
             sb.append(word2.charAt(k));
             }
             i++;
             k++;
         }
        return sb.toString();
    }
}