class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : s1.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word : s2.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String i : map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        String[]str = new String[list.size()];
        return list.toArray(str);
    }
}