class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        int[] result = new int[2];

        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count1++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums2.length; i++)
        {
            for(int j = 0; j < nums1.length; j++)
            {
                if(nums1[j]==nums2[i])
                {
                    count2++;
                    break;
                }
            }
        }
        result[0] = count1;
        result[1] = count2;

        return result;
    }
}
