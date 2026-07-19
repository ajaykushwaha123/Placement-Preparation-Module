class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        for(int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();
        boolean[] set = new boolean[26];

        for(int i = 0; i < s.length(); i++) {
            int cur = stack.length();
            while(cur > 0 && stack.charAt(cur - 1) > s.charAt(i) && last[stack.charAt(cur - 1) - 'a'] > i && !set[s.charAt(i) - 'a']) {
                set[stack.charAt(cur - 1) - 'a'] = false;
                stack.deleteCharAt(cur - 1);
                cur = stack.length();
            }

            if(!set[s.charAt(i) - 'a']) {
                stack.append(s.charAt(i));
                set[s.charAt(i) - 'a'] = true;
            }
        }

        return stack.toString();
    }
}