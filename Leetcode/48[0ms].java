public class Solution {
    public void rotate(int[][] matrix) {
        
      int n = matrix.length-1;
        int limit = n/2;
        for(int i=0;i<= limit; i++){
            for(int j=i;j<n-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = matrix[j][n-i];
                matrix[j][n-i] = temp;
            }
        }
    }
}