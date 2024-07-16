class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if(nums[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        int a = 0;
        for(int i = 1; i <= zero; i++){
            nums[a] = 0;
            a++;
        }
        for(int i = 1; i <= one; i++){
            nums[a] = 1;
            a++;
        }
        for(int i = 1; i <= two; i++){
            nums[a] = 2;
            a++;
        }
        // // insertion sort
        // for(int i = 1; i< nums.length; i++){
        //     int j = i-1;
        //     int temp = nums[i];
        //     while(j >=0 && nums[j]>temp){
        //         nums[j+1] = nums[j];
        //         j--;
        //     }
        //     nums[j+1] = temp;
        // }
    }
}