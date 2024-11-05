class Solution {
    public int minChanges(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0; i < s.length(); i+=2){
            if(ch[i]!=ch[i+1]){
                count++;
            }
        }
        return count;
    }
}