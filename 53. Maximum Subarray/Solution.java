class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) 
        {
            return 0;
        }
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            if(sum > maxi)
            {
                maxi = Math.max(maxi,sum);
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}
