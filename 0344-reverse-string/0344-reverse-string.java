class Solution {
    public void reverseString(char[] s) {
        if(s.length==0){
            return;
        }
        for(int i =0;i<(s.length/2); i++){
            char l = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = l;
        }
        System.out.print(s);
    }
}