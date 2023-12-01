class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum = "";
        String sum1 = "";
        for(int i =0; i < word1.length; i++){
            sum += word1[i];
        }
        for(int i =0; i < word2.length; i++){
            sum1 += word2[i];
        }
        return sum.equals(sum1);
    }
}