class Solution {
    public int maxDepth(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for(int i =0 ;i < s.length(); i++){
            if(ch[i] == '('){
                stk.push(ch[i]);
            }
            else if(ch[i] ==')'){
                stk.pop();
            }
            count = Math.max(count, stk.size());
        }
        return count;
    }
}