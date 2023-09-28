class Solution {
    public int maxArea(int[] height) {
         int max=0;
        int left = 0;
        int right = height.length-1;
        while(right > left) {
            max= Math.max((right-left)*Math.min(height[right], height[left]), max);
            if(height[right] < height[left])
                right--;
            else
                left++;

        }
        return max;
    }
}