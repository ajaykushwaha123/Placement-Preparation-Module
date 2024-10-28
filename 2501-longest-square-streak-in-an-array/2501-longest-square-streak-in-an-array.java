class Solution {
    public int longestSquareStreak(int[] nums) {
        int streak = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int startN : nums){
            int currS = 0;
            long curr = startN;
            while(set.contains((int) curr)){
                currS++;
                if(curr * curr > 1e5) break;
                curr *= curr;
            }
            streak = Math.max(streak, currS);
        }
        return streak < 2 ? -1 : streak;
    }
}