class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length){
            return false;
        }
        HashMap<String, Integer> wordToindex = new HashMap<>();
        HashMap<Character, Integer> charToindex = new HashMap<>();
        for(Integer i = 0; i < word.length; i++){
            if(wordToindex.put(word[i],i) != charToindex.put(pattern.charAt(i), i))
                return false;
            
        }
        return true;
    }
}