class Solution {
    public void rotate(int[][] matrix) {
    //     int arr[][] = new int[matrix.length][matrix[0].length];
    //     for(int i = 0; i < matrix.length; i++)
    //         for(int j = 0; j < matrix[0].length; j++)
    //             arr[j][matrix.length - 1 - i] = matrix[i][j];
    
    //     for(int i = 0; i < matrix.length; i++)
    //         for(int j = 0; j < matrix[0].length; j++)
    //             matrix[i][j] = arr[i][j];

    // Without using extra space: Transpose than reverse each row.

    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < i; j++)              // j < i : Keep in mind.
            swap(matrix, i, j);
        }

    for(int i = 0; i < matrix.length; i++)
            reverse(matrix, i);

    }

    void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    void reverse(int matrix[][], int  i){
        int j = 0;
        int k = matrix[0].length-1;
        while(j < k){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][k];
            matrix[i][k] = temp;
            j++;
            k--;
        }
    }
}