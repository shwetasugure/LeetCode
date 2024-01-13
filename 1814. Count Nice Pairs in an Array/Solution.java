import java.util.Arrays;

class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1_000_000_007;
        int len = nums.length;
        for(int i=0;i<len;i++) nums[i] = nums[i] - reverseNum(nums[i]);
        Arrays.sort(nums);
        long res = 0;
        for(int i=0;i<len-1;i++) {
            long cont = 1;
            while(i<len-1 && nums[i]==nums[i+1]) {
                cont++;
                i++;
            }
            res = (res%MOD + (cont*(cont-1))/2)%MOD;
        }
        return (int) res%MOD;
    }

    private int reverseNum(int num)
    {
        int reversed = 0;
        while (num > 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
 
