class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length/2;
        return nums[half];
    }
}
