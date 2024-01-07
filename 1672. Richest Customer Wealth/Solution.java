class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        int i = 0;
        while (i != accounts.length)
        {
            for(int j = 0; j < accounts[0].length; j++)
            {
                sum = sum + accounts[i][j];
            }
            max = Math.max(sum , max);
            sum = 0;
            i++;
        }
        return max;
    }
}
