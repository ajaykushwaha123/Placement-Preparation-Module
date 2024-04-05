class Solution {
    public String makeGood(String s) {
          Stack<Character> stck = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stck.size() > 0 && stck.peek() != ch) {
                String s1 = "" + stck.peek();
                String s2 = "" + ch;

                if (s1.toLowerCase().equals(s2.toLowerCase()))
                    stck.pop();
                else
                    stck.push(ch);
            } else {
                stck.push(ch);
            }
        }

        String res = "";
        while (stck.size() > 0) {
            res = stck.pop() + res;
        }
        return res;
    }
}