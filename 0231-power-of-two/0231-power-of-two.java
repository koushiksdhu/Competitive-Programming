class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n == 0)
        //     return false;
        // if(n == 1)
        //     return true;
        // return (int)Math.pow(2, (int)((double)Math.log(n) / (double)Math.log(2))) == n;
        return n > 0 && (n&(n-1)) == 0;
    }
}