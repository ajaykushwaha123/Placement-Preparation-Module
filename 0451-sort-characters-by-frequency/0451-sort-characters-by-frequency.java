class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(char ch :s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((c1,c2) -> freqMap.get(c2)-freqMap.get(c1));
        pq.addAll(freqMap.keySet());

        StringBuilder sb = new StringBuilder();
       while(!pq.isEmpty()){
          char ch = pq.poll();
          int freq = freqMap.get(ch);
          for(int i=0; i<freq; i++){
             sb.append(ch);
          }
       }
        return sb.toString();
    }
}