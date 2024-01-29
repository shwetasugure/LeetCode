class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int[] rowDiff = new int[row];
        int[] colDiff = new int[col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 1)
                {
                    rowDiff[i]++;
                    colDiff[j]++;
                }
                else
                {
                    rowDiff[i]--;
                    colDiff[j]--;
                }
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j <col; j++)
            {
                grid[i][j] = rowDiff[i] + colDiff[j];
            }
        }
        return grid;
    }
}
