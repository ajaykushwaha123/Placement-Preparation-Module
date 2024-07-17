class Solution {
    public int maxArea(int[] height) {
        int L = 0;
        int R = height.length - 1;
        int max = 0;
        while(L < R){
            max = Math.max((R-L) * Math.min(height[R],height[L]),max);
            if(height[L] < height[R]){
                L++;
            }
            else{
                R--;
            }
        }
        return max;
    }
}