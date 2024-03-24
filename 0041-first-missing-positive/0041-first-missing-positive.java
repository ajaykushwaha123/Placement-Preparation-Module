class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int a=1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0 & a==nums[i])
        {
         a++;
        }
       
    }
    return a;
    }
}