class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubset(nums,0, new ArrayList<>());
        return result;
    }
    public void findSubset(int nums[], int index, List<Integer> sublist){
        if(index == nums.length){
            result.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[index]);
        findSubset(nums, index+1, sublist);
        sublist.remove(sublist.size()-1);
        findSubset(nums, index+1,sublist);
    }
}