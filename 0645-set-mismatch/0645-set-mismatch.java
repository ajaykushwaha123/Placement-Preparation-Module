class Solution {
    public int[] findErrorNums(int[] nums) {
       int ans[] = new int[2] ;
        int n = nums.length ;
        HashSet<Integer> set = new HashSet<>() ;
        int sum = n*(n+1)/2 ;
        int repeat = -1 ;
        for(int val : nums){
            if(set.contains(val)){
                repeat = val ;
            }
            else{
                set.add(val) ;
                sum -= val ;
            }
        }
        ans[0] = repeat ;
        ans[1] = sum ;
        return ans ;
    }
}