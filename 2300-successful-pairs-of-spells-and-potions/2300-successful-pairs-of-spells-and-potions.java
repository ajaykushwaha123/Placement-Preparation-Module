class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            int left = 0;
            int right = m-1;
            while (left<=right) {
                int mid = (left+right)/2;
                long product = (long)spells[i] * potions[mid];
                if (product>=success){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i] = m-left;
        }
        return ans;
    }
}