class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int l = 0;
        int r = 0;
        while(r < nums.length-1){
            int path = 0;
            for(int i = l; i <= r; i++){
                path = Math.max(i+nums[i],path);
            }
            l = r + 1;
            r = path;
            jump++;
        }
        return jump;
    }
}