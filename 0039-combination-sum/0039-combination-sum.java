class Solution {
    public static void sum(int i, int[] arr, List<List<Integer>> list, List<Integer> ds,int target){
        if(i==arr.length){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=target){
            ds.add(arr[i]);
            sum(i,arr,list,ds,target-arr[i]);
            ds.remove(ds.size()-1);
        }
        sum(i+1, arr, list, ds, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> list= new ArrayList<>();
       sum(0,candidates,list,new ArrayList<>(),target);
       return list;
       
    }
}