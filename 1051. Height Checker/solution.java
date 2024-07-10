class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] old = new int[len];
        for(int i = 0; i < len; i++){
                old[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < len; i++){
            if(heights[i] != old[i]){
                count++;
            }
        }
        return count;
    }
}
