class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                left.push(i);
            }
            else if(s.charAt(i) == '*'){
                star.push(i);
            }
            else{
                if(!left.isEmpty()){
                    left.pop();
                }
               else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!left.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            if(left.pop() > star.pop()){
                return false;
            }
        }
        return left.isEmpty();
    }
}