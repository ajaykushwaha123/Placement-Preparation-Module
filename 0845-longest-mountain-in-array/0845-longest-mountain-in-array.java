class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n<=2){
            return 0;
        }
        int[] inc = new int[n];
        int[] dec = new int[n];
        int max = 0;

        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                inc[i] = inc[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(arr[i+1]<arr[i]){
                dec[i] = dec[i+1]+1;
            }
        }

        for(int i=0;i<n;i++){
            if(inc[i]!=0 && dec[i]!=0){
            max = Math.max(max, inc[i]+dec[i]);
            }
        }

        if(max==0){
            return 0;
        }
        return max+1;
    }
}