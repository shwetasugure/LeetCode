class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum1=0;
        int[] result = new int[2];
        for(int i = 1; i < n; i++)
        {
            if(nums[i-1] == nums[i])
            {
                result[0] = nums[i-1];
            }
            sum1 = sum1+nums[i];
        }
        result[1] = totalSum - sum1 + result[0];

        return result;
    }
}
