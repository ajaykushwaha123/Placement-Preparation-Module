class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int j = 1;
        for(int i = 0; i < n/2; i++){
            arr[i] = j;
            arr[n-1-i] = -j;
            j++;
        }
        return arr;
    }
}