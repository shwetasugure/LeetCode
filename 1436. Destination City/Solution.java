
class Solution {
    public String destCity(List<List<String>> paths) {
        for(int i = 0; i < paths.size(); i++)
        {
            String a = paths.get(i).get(1);
            int flag = 1;
        
            for( int j = 0; j < paths.size(); j++)
            {
                if(paths.get(j).get(0).equals(a))
                {
                    flag = 0;
                }
            }

            if(flag == 1)
            {
                return a;
            }
        }
     return "";   
    }
}
