class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int val = arr.length -1;
        while(val > 0 && arr[val] >= arr[val-1]){
            val--;
        }
        int ans = val;
        int l = 0;
        while(l < val && (l == 0 || arr[l-1] <= arr[l])){
            while(val < arr.length && arr[l] > arr[val]){
                val++;
            }
            ans = Math.min(ans, val - l - 1);
            l++;
        }
        return ans;
    }
}