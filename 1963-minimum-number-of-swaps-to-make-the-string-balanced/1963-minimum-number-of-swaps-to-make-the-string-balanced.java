class Solution {
    public int minSwaps(String s) {
        Stack stack = new Stack<>();
        int countSwap = 0;

        for(char ch:s.toCharArray()){
            if(ch=='['){
                stack.push(ch);
            } else{
                if(!stack.isEmpty()){
                    stack.pop();
                } else{
                    countSwap++;
                }
            }
        }

        return (countSwap+1)/2;
    }
}