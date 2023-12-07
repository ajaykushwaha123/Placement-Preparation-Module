class Solution {
    public int getMaxLen(int[] nums) {
        int pos = 0, neg = 0, result= 0, N = nums.length;
        for(int i=0; i<N; i++){
            if(nums[i]==0){
                pos=0;
                neg=0;
            } else if(nums[i] > 0){
                pos= pos+1;
                neg = neg ==0 ? 0 : neg+1;
                
            } else{
                int temp = pos;
                pos = neg ==0  ? 0 : neg+1; 
                neg = temp+1;
            }
            result = Math.max(pos, result);
        }
        
        return result;
    }
}