class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int curr= 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                int currWord = i-1;
                String reverseword = "";
                for(int j = curr; j <= currWord; j++){
                    reverseword =  s.charAt(j) + reverseword;
                }
                ans+= reverseword + " ";
                curr = i + 1;
            }
            
        } 
        String str = "";
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i)== ' '){
                break;
            }
            else{
                str+= s.charAt(i);
            }
        }
        
        return ans + str;
    }
}