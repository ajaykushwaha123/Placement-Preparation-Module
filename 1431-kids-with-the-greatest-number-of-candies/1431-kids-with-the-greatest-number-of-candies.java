class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int n = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(n < candies[i]){
                n = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies>= n){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}