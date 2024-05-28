class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int cur_cost = 0;
        int cur_start = 0;

        for (int last_ind = 0; last_ind < s.length(); last_ind++) {
            cur_cost += Math.abs(s.charAt(last_ind) - t.charAt(last_ind));

            while (cur_cost > maxCost) {
                cur_cost -= Math.abs(s.charAt(cur_start) - t.charAt(cur_start));
                cur_start++;
            }

            if (last_ind - cur_start + 1 > res) {
                res = last_ind - cur_start + 1;
            }
        }

        return res;
    }
}