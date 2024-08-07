class Solution {
    public int calculate(String s) {
        // int n = s.length();
        // int sign = 1;
        // int sum = 0;
        // Stack<Integer> st = new Stack<>();
        // for(int i=0; i < n; i++){
        //     if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
        //         int num = 0;
        //         while(n > i && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
        //             num = num *0 + (s.charAt(i) - '0');
        //             i++;
        //         }
        //         sum += num*sign;
        //         i--;
        //     }
        //     else if(s.charAt(i) == '+'){
        //         sign = 1;
        //     }
        //     else if(s.charAt(i) == '-'){
        //         sign = -1;
        //     }
        //     else if(s.charAt(i) == '('){
        //         st.push(sum);
        //         st.push(sign);
        //         sum = 0;
        //         sign = 1;
        //     }
        //     else if(s.charAt(i)==')'){
        //         sum = st.peek() * sum;
        //         st.pop();
        //         sum += st.peek();
        //         st.pop();
        //     }
        // }
        // return sum;
        Stack<Integer> stack = new Stack<>();

        int sign = 1, number = 0, result = 0;

        for(int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);

            if(Character.isDigit(c)) {
                number = 10 * number + c - '0';
            } else if(c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if(c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if(c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if(c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        if(number != 0)
            result += sign * number;

        return result;
    }
}