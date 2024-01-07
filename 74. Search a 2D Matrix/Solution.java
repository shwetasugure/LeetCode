class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int column = matrix[0].length;
        int row = matrix.length;
        for(int i = 0; i < row; i++)
        {
            if(target >= matrix[i][0] && target <= matrix[i][column-1])
            {
                for(int j = 0; j < column; j++)
                {
                    if(matrix[i][j] == target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
