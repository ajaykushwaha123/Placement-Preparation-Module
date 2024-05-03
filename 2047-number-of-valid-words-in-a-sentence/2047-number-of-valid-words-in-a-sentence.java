class Solution {
    public int countValidWords(String sentence) {
        String s1 = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String s2 = "[^0-9]+";

        String[] str = sentence.split("\\s+");
        int count=0;
        for(String s:str){
            if(s.matches(s1) && s.matches(s2)){
                count++;
            }
        }
        return count;
    }
}