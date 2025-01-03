class Solution {
    public boolean canSortArray(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length);
        int n = arr.length;
        for(int i = 0 ;i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] <= arr[j+1]){
                    continue;
                }
                else{
                    if(Integer.bitCount(arr[j]) == Integer.bitCount(arr[j+1])){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}