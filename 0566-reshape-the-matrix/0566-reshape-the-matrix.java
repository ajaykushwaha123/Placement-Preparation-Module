class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][] = new int[r][c];
        int row = 0;
         int column = 0;
        if((mat.length)*(mat[0].length) != r*c){
            return mat;
        }
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
                arr[row][column] = mat[i][j];
                column++;
        if(column == c){
            row++;
            column = 0;
        }
    }
    }
    return arr;
    }
}