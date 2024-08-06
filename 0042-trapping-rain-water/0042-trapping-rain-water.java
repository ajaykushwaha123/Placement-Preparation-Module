class Solution {
    public int trap(int[] height) {
        int lMax = 0;
        int rMax = 0;
        int total = 0;
        int l = 0;
        int r = height.length-1;
        while(l < r){
            if(height[l] <= height[r]){
                if(lMax > height[l])
                    total += lMax- height[l];
                
                else
                    lMax = height[l];
                
                l = l+1;
            }
            else{
                if(rMax > height[r])
                    total += rMax-height[r];
                
                else
                    rMax = height[r];
                
                r = r-1;
            }
        }
        return total;
    }
}