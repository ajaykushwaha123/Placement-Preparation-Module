class Solution {
    public int removeDuplicates(int[] nums) {
        // ArrayList<Integer> map = new ArrayList<>();
        // int count = 0;
        // for(int i = 0; i< nums.length; i++){
        //     if(!map.contains(nums[i])){
        //         map.add(nums[i]);
        //     }
        // }
        // for(int i = 0; i < map.size(); i++){
        //     nums[i] = map.get(i);
        // }
        // return map.size();
        int j = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}