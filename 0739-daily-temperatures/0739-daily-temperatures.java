class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i < temperatures.length; i++){
            while(!st.empty() && temperatures[st.peek()] < temperatures[i]){
                Integer pop = st.pop();
                res[pop] = i - pop;
            }
            st.push(i);
        }
        return res;
    }
}