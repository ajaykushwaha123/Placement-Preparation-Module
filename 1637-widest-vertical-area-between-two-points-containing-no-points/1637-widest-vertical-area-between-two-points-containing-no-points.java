class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr []=new int [points.length];
            for(int i=0;i<arr.length;i++){arr[i]=points[i][0];}

                Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max( Math.abs(arr[i]-arr[i+1]) , max);
        }
        return max;
    }
}