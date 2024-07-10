class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1];
        int k = 0;
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(nums1[i] == nums2[j]){
                    ans[k] = greaterNum(nums2[j] , nums2);
                    k++;
                }
            }
        } 
        return ans; 
    }

     public int greaterNum(int num, int[] nums2) {
        boolean found = false;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == num) {
                found = true;
            }
            if (found && nums2[i] > num) {
                return nums2[i];
            }
        }
        return -1;
    }
}
