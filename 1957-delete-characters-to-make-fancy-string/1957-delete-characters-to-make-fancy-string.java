class Solution {
    public String makeFancyString(String s) {
        if(s.length() == 1 || s.length() == 2){
            return s;
        }
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for(int i = 1; i < s.length() -1; i++){
            if(s.charAt(i-1) != s.charAt(i) || s.charAt(i) != s.charAt(i+1)){
                str.append(s.charAt(i));
            }
        }
        str.append(s.charAt(s.length()-1));
        return new String(str);
    }
}