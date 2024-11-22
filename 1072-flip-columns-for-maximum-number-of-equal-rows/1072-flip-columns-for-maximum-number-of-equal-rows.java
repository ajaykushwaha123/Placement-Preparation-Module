class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix[0].length;
        int max = 0;
        for(int[] currRow : matrix){
            int[] fliprow  = new int[n];
            int count = 0;
            for(int col = 0; col < n; col++){
                fliprow[col] = 1 - currRow[col];
            }
            for(int[] compareRow : matrix){
                if(Arrays.equals(compareRow, currRow) || Arrays.equals(compareRow, fliprow)){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}