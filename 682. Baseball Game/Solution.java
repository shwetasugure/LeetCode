class Solution {
    public int calPoints(String[] operations) {
        int len = operations.length;
        int[] ans = new int[len];
        for(int i = 0, j = -1; i < len; i++){
            if(operations[i].equals("+")){
                j++;
                ans[j] = (ans[j-1] + ans[j-2]);
            }
            else if(operations[i].equals("D")){
                j++;
                ans[j] = 2 * (ans[j-1]);
            }
            else if(operations[i].equals("C")){
                ans[j] = 0;
                j--;
            }
            else{
                j++;
                ans[j] = (Integer.parseInt(operations[i]));
            }
        }
        int finalans = 0;
        for(int k = 0; k < ans.length; k++){
            finalans = ans[k] + finalans;
        }
        return finalans;
    }
    
}
