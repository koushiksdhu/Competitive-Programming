class Solution {
    public int integerBreak(int n) {
    //    if(n <= 3)
    //         return n-1;
    //     int q = n / 3, rem = n % 3;
    //     return rem == 0 ? (int)Math.pow(3, q) : (rem == 1 ? (int)Math.pow(3, q-1) * 4 : (int)Math.pow(3, q) * 2); 

    

    // Another Method:
    if(n == 2)
        return 1;
    if(n == 3)
        return 2;

    int prod = 1;
    while(n > 4){
        prod *= 3;
        n -= 3;
    }
    prod *= n;
    return prod;
    }
}