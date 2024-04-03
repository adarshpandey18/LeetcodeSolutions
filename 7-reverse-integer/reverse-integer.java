class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        int temp = x;
        long number = 0;
        while( temp > 0) {
            int r = temp % 10;
            temp = temp / 10;
            number = number*10 + r;
        }
        if(number > Math.pow(2,31)|| number < Math.pow(-2,31))
            return 0;

        if(isNegative)
            return (int)number*-1;
        return (int)number;

    }
}