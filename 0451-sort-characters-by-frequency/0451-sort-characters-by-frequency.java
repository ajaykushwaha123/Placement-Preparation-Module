class Solution {
    public String frequencySort(String s) {
         HashMap<Character , Integer> map = new HashMap<>();
    for(int i = 0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            int currentFrequency = map.get(s.charAt(i));
            ++currentFrequency;
            map.put(s.charAt(i),currentFrequency);
        }else{
            map.put(s.charAt(i),1);
        }
    }
     PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
    StringBuilder ans = new StringBuilder();

    while(!pq.isEmpty()){
            char cur=pq.remove();
            int l=map.get(cur);
            while(l-->0)
            ans.append(cur);
        }
        return ans.toString();
    }
}