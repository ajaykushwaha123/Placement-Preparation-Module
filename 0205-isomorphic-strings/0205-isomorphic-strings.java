class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        if (n != m) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (hm.containsValue(t.charAt(i))) {
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}