class Solution {
    public int climbStairs(int n) {
        int first = 0;
        int second = 1;
        int nextterm = 0;
        for(int i = 0; i < n; i++)
        {
            nextterm = first + second;
            first = second;
            second = nextterm;
        }
        return nextterm;
    }
}


