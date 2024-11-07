class Solution {
     public int findMax(int[] arr,int s,int e){
        int max=0;
        int idx=0;
        for(int i=s;i<=e;i++){
            if(max<arr[i]){
                max=arr[i];
                idx=i;
            }
        }
        return idx;
    }
    public void reverse(int[] arr,int s,int e){
        for(int i=s;i<=e;i++){
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;
            e--;
        }
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer>list=new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int maxidx=findMax(arr,i,j);
            reverse(arr,i,maxidx);
            list.add(maxidx+1);
            reverse(arr,i,j);
            list.add(j+1);
            j--;

        }
        return list;
    }
}