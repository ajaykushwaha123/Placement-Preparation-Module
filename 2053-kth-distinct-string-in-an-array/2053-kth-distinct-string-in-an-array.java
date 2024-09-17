class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : arr){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String i : arr){
            if(map.get(i)==1){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return "";
    }
}