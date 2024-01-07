class Solution {
    public int integerBreak(int n) {
        if (n <= 1)
        { 
            return 0;
        }
        if(n == 2)
        {
            return 1;
        }
        if(n == 3)
        {
            return 2;
        }

        int result = 1;
        while(n > 4)
        {
            result = result * 3;
            n = n - 3;
        }
        result = result * n;
        return result;
    }
}
