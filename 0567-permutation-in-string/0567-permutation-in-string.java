class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
           s1arr[s2.charAt(i) - 'a']--;
            if(i - s1.length() >= 0)
                s1arr[s2.charAt(i-s1.length()) - 'a']++;
            if(matches(s1arr))
                return true;
                
            
        }
        return false;
    }
    
    public boolean matches(int[] s1arr) {
        for (int i = 0; i < 26; i++) {
            if (s1arr[i] != 0)
                return false;
        }
        return true;
    }
}