class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0; i<ranks.length; i++){
            h.put(ranks[i], h.getOrDefault(ranks[i],0)+1);
        }
        HashMap<Character, Integer> h1=new HashMap<>();
        for(int i=0; i<suits.length; i++){
            h1.put(suits[i], h1.getOrDefault(suits[i],0)+1);
        }
        for(int i: h1.values()){
            if(i==5){
                return "Flush"; 
            }
        }
        for(int i: h.values()){
            if(i>=3){
                return "Three of a Kind";
            }
        }
        for(int i: h.values()){
            if(i==2){
                return "Pair";
            }
        }
        for(int i: h.values()){
            if(i==1){
                return "High Card";
            }
        }
        return "";
    }
}