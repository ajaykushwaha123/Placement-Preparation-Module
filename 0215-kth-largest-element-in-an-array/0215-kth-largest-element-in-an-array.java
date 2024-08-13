class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ;i < nums.length; i++){
            pq.add(nums[i]);
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(i==nums.length-k){
                ans = pq.poll();
            }
            else{
                pq.poll();
            }
        }
        return ans;
    }
}