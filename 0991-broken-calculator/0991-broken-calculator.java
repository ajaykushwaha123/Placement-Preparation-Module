class Solution {
    public int brokenCalc(int startValue, int target) {
        int val = 0;
        while(target > startValue){
            val++;
                if(target % 2 == 1){
                    target++;
                }
            else{
                target /= 2;
            }
        }
        return val + startValue - target;
    }
}