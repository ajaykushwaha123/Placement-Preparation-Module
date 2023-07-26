class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> list = new HashSet<>();
        for(int i = 0; i <= s.length() - 10; i++){
            String substring = s.substring(i,i+10);
            if(set.contains(substring)){
                list.add(substring);
            }
            else{
                set.add(substring);
            }
        }
        return new ArrayList<>(list);
    }
}