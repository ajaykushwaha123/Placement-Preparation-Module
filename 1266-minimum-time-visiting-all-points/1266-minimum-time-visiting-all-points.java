class Solution {
    public int minTimeToVisitAllPoints(int[][] arr) {
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n-1; i++){
            int a = Math.abs(arr[i][0]-arr[i+1][0]);
            int b = Math.abs(arr[i][1]-arr[i+1][1]);
            ans = ans + Math.max(a,b);
        }
        return ans;
    }
}