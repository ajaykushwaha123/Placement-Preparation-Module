class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for(int n : nums){
            if(Math.abs(n) > max){
                if(set.contains(-n)){
                    max = Math.abs(n);
                }
                else{
                    set.add(n);
                }
            }
        }
        return max;
    }
}