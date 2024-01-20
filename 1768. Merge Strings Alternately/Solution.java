class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;

        while(i < len1 || j < len2)
        {
            if(i >= len1)
            {
                ans.append(word2.charAt(j++));
            }
            else if(j >= len2)
            {
                ans.append(word1.charAt(i++));
            }
            else
            {
                ans.append(word1.charAt(i++)).append(word2.charAt(j++));
            }
        }
        return ans.toString();
    }
}
