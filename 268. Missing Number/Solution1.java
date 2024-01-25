class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int N = n - 1;
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ nums[i]; 
            xor1 = xor1 ^ (i + 1); 
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}
