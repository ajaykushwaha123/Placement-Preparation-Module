class Solution {
    public int firstUniqChar(String s) {
            HashMap<Character, Integer> M = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            M.put(s.charAt(i), M.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (M.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}