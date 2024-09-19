class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        for(int i = 1 ;i <= (int)Math.sqrt(area); i++){
            if(area % i == 0){
                arr[0] = area/i;
                arr[1] = i;
            }
        }
        return arr;
    }
}