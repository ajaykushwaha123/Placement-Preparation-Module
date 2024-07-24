class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        if(n < m){
            return new ArrayList<>();
        }
       final List<Integer> result = new ArrayList<>();
        final int n1 = p.length();
        final int[] freq1 = new int[26], freq2 = new int[26];

        for(int i = 0; i < n1; ++i) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2))
            result.add(0);

        for(int i = n1; i < s.length(); ++i) {
            freq2[s.charAt(i - n1) - 'a']--;
            freq2[s.charAt(i) - 'a']++;

            if(Arrays.equals(freq1, freq2))
                result.add(i - n1 + 1);
        }

        return result;
}
}