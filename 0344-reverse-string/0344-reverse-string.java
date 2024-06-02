class Solution {
    public void reverseString(char[] s) {
        // // char[] c = new char[s.length];
        // // int j = 0;
        // for(int i = s.length-1; i>=0; i--){
        //   System.out.print(s[i]);
        // }
       int i = 0;
       int j = s.length-1;
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}