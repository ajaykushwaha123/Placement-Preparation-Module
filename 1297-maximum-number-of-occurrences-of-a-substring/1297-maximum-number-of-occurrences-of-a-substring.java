class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
        Map<String, Integer> substringFrequency = new HashMap<>();
        int maxFreq = 0;

        for (int i = 0; i <= n - minSize; i++) {
            String substring = s.substring(i, i + minSize);
            Set<Character> uniqueChars = new HashSet<>();
            int distinctChars = 0;

            for (char c : substring.toCharArray()) {
                if (!uniqueChars.contains(c)) {
                    distinctChars++;
                    uniqueChars.add(c);
                }
            }

            if (distinctChars <= maxLetters) {
                int frequency = substringFrequency.getOrDefault(substring, 0) + 1;
                substringFrequency.put(substring, frequency);
                maxFreq = Math.max(maxFreq, frequency);
            }
        }

        return maxFreq;
    }
}