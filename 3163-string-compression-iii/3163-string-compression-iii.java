class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder("");
        int i = 0;
        while(i < word.length()){
            int count = 0;
            char ch = word.charAt(i);
            while(i < word.length() && count < 9 && ch == word.charAt(i)){
                count++;
                i++;
            }
            ans.append(count).append(ch);
        }
        return ans.toString();
    }
}