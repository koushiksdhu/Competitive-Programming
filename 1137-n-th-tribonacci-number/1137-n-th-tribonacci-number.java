class Solution {
    public int tribonacci(int n) {
        if(n < 2)
            return n;
        int a = 0, b = 1, c = 1;
        int sum = 0;
        for(int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}