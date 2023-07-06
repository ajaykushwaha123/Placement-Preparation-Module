class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int zero = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            if(nums[i] == 1){
                one++;
            }
            if(nums[i] == 2){
                two++;
            }
        }
        int index = 0;
        for(int i = 1;i<=zero;i++){
            nums[index++] = 0;
        }
         for(int i = 1;i<=one;i++){
            nums[index++] = 1;
        }
         for(int i = 1;i<=two;i++){
            nums[index++] = 2;
        }
       
    }
}