class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0;i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == map.get(arr[i])){
                if(arr[i] > max)
                    max = arr[i];
            }
            
        }
        if(max != Integer.MIN_VALUE){
            return max;
        }
        return -1;
    }
}