public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        for(int i = 1; i <= 32; i++){
            reverse <<= 1;
            reverse |= (1&n);
            n >>= 1;
        }
        return reverse;
    }
}