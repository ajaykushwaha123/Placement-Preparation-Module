class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
       return gcd(max, min);
    }
    public int gcd(int a, int b){
         while(b!= 0){
            int rem = a%b;
            a = b;
            b = rem;
         }
    
    return a;
    }
}