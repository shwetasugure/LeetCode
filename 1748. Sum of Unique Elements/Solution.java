class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int flag = 0; 
            
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
}
