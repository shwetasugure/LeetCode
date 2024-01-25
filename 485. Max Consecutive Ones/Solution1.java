class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int max1 = 0;

        for(int i = 0; i < len ; i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            else
            {
                max1 = Math.max(count,max1);
                count = 0;
            }
        }
        return Math.max(count,max1);
    }
}
