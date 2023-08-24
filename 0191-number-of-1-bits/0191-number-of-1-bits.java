public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // String str = Integer.toBinaryString(n);
        // int count = 0;
        // for(int i = 0; i < str.length(); i++){
        //     if(str.charAt(i)-'0' == 1)
        //         count++;
        // }
        // return count;

       int count = 0;
       for(int i = 0; i < 32; i++){
           if((n&1) == 1)
               count++;
            n >>= 1;
       }
       return count;
    }
}