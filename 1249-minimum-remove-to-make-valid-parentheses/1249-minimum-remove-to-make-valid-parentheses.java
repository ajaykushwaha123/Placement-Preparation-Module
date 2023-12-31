class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack();
        char[] ch = s.toCharArray();
        for(int  i = 0; i < ch.length; i++){
            if(ch[i] == '('){
                stack.push(i);
            }
            else if(ch[i] == ')'){
                if(stack.isEmpty()){
                    ch[i] = '*';
                }
                else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            ch[stack.pop()] = '*';
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] != '*'){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}