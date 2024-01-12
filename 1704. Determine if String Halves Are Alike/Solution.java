class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int len = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < len/2; i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count1++;
            }
        }
        for(int j = len/2; j < len; j++)
        {
            if(isVowel(s.charAt(j)))
            {
                count2++;
            }
        }
        return count1 == count2;
    }
    public boolean isVowel(char x)
    {
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
        {
            return true;
        }
        return false;
    }
}
