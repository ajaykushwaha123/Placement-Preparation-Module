class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>>ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])j++;
                    while(j < k && nums[k] == nums[k+1])k--;
                }
            }
        }
        return new ArrayList<>(ans);
            
    }
}