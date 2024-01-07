class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        int n = s.length();
        for(int left = 0; left < n; left++)
        {
            for(int right = left+1; right < n; right++)
            {
                if(s.charAt(left) == s.charAt(right))
                {
                    ans = Math.max(ans,right-left-1);
                }
            }
        }
        return ans;
    }
}
