class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;

        if(len == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        for(int i = 0; i < len-1; i++){
            if(i % 2 == 0){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
                if(len%2 != 0  && nums[len-1] != nums[len-2]){
                    return nums[len-1];
                }
            }
        }
        return 0;
    }
}
