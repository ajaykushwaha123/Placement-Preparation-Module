class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String n : sentences) {
            String[] newStr = n.split(" ");
            if(max < newStr.length) max = newStr.length;
        }
        return max;
    }
}