class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] ^ arr[i-1];
        }
        for(int[]a : queries){
            if(a[0] > 0){
                list.add(arr[a[0]-1] ^ arr[a[1]]);
            }
            else{
                list.add(arr[a[1]]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}