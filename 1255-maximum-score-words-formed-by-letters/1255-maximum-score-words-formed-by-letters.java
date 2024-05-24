class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freqAv = new int[26];
        for (char ch : letters) {
            freqAv[ch - 'a']++;
        }

        int maxScore = 0;
        int[] currSubNeeds = new int[26];
        int size = words.length;

        for (int indxMask = 1; indxMask < (1 << size); indxMask++) {
            java.util.Arrays.fill(currSubNeeds, 0);
            for (int indx = 0; indx < size; indx++) {
                if ((indxMask & (1 << indx)) != 0) {
                    String currWrd = words[indx];
                    for (char chr : currWrd.toCharArray()) {
                        currSubNeeds[chr - 'a']++;
                    }
                }
            }

            boolean notPos = false;
            int scoreTotal = 0;
            for (int indx = 0; indx < 26; indx++) {
                if (currSubNeeds[indx] > freqAv[indx]) {
                    notPos = true;
                    break;
                } else {
                    scoreTotal += score[indx] * currSubNeeds[indx];
                }
            }
            if (!notPos) {
                maxScore = Math.max(maxScore, scoreTotal);
            }
        }

        return maxScore;
    }
}