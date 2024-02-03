class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int[] ans = new int[l1+l2];

        for(int i = 0; i < l1; i++)
        {
            ans[i] = nums1[i];
        }
        for(int j = 0; j <l2; j++)
        {
            ans[l1+j] = nums2[j];
        }

        Arrays.sort(ans);
        int half = (l1+l2)/2;
        if(ans.length % 2 != 0)
        {
            double result1 = ans[half];
            return result1;
        }
        else
        {
            double result2 =(ans[half] + ans[half-1])/2.0;
            return result2;
        }
    }
}
