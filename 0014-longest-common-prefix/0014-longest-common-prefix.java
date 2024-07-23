class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        Arrays.sort(strs);
        String l = strs[0];
        String h = strs[strs.length - 1];
        for(int i = 0; i<l.length();i++){
            if(l.charAt(i)!=h.charAt(i)){
                break;
        }
        str =str+l.charAt(i);
        }
        return str;
    }
}