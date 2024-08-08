class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                num = num*10 + c - '0';
            }
            else if(c == '['){
                strStack.push(sb);
                sb = new StringBuilder();
                numStack.push(num);
                num = 0;
            }
            else if ( c == ']'){
                StringBuilder temp = sb;
                sb = strStack.pop();
                int count = numStack.pop();
                while(count--> 0){
                    sb.append(temp);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}