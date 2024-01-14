class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if(num <= 9)
        {
            return num;
        }

        while(num > 0)
        {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;

            if(num == 0 && sum > 9)
            {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
