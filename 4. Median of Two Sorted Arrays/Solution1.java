class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int[] ans = new int[l1+l2];
        int i = 0, j = 0, k = 0;
        while(i < l1 && j < l2)
        {
            if(nums1[i]<nums2[j])
            {
                ans[k++] = nums1[i++];
            }
            else
            {
                ans[k++] = nums2[j++];
            }
        }
        while(i < l1)
        {
            ans[k++] = nums1[i++];
        }
        while(j < l2)
        {
            ans[k++] = nums2[j++];
        }

        int half = ans.length/2;
        double result;
        if(ans.length % 2 == 0)
        {
            result = (ans[half] + ans[half-1])/2.0; 
        }
        else
        {
            result = ans[half];
        }
        return result;
    }
}
