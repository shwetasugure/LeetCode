class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        while(i<len1 && j<len2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                result.add(nums1[i++]);
                j++;
              
            }
        }
        int[] res = new int[result.size()];
        for(int k = 0; k < result.size(); k++){
            res[k] = result.get(k);
        }

        return res;
    }
}
