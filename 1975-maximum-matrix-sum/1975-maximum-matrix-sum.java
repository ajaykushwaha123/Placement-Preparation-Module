class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int count = 0;
        long sum = 0;
        int min1 = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sum += Math.abs(matrix[i][j]);
                
                if(matrix[i][j] < 0){
                    count++;
                }
                min1 = Math.min(min1, Math.abs(matrix[i][j]));
            }
        }
        if(count % 2 == 0){
            return sum;
        }
        else{
        return sum - 2*min1;
        }
       
    }
}