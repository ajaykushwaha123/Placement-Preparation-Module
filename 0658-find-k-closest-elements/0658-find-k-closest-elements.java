class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> nm=new ArrayList<>();
        int i=0,j=arr.length-1;
        while(j-i+1>k)
        {
            if(Math.abs(x-arr[i])>Math.abs(x-arr[j]))
            {
                i++;
            }
            else if(Math.abs(x-arr[i])<=Math.abs(x-arr[j]))
            {
                j--;
            }
        }
        for(int p=i;p<=j;p++)
        {
            nm.add(arr[p]);
        }
        return nm;
    }
}