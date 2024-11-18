class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int res = Integer.MAX_VALUE;
        int n = words.length;
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                int d = Math.abs(i - startIndex);
                res = Math.min(res, d);
                res = Math.min(res, n - d);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}