class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 1;
        int n = intervals.length;
        int lastendTime = intervals[0][1];
        for(int  i = 1; i < n; i++){
            if(intervals[i][0] >= lastendTime){
                count++;
                lastendTime = intervals[i][1];
            }
        }
        return n - count;
    }
}