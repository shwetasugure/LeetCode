class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int prev = 0;
        int curr = 0;

        for (int i = 0; i < n; i++) {
            int temp = curr;
            curr = Math.max(prev + nums[i], curr);
            prev = temp;
        }

        return curr;
    }

}
