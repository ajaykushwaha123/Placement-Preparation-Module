class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i = 0;
        while(num > 0){
            int val = num % 10;
            arr[i] = val;
            i++;
            num = num /10;
        }
        Arrays.sort(arr);
        return arr[0]*10 + arr[2] + arr[1]*10 + arr[3];
    }
}