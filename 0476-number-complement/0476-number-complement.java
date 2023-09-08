class Solution {
    public int findComplement(int num) {
        int temp = num;
        int mask = ~0;
        while(temp > 0){
           mask <<= 1;
           temp >>= 1;
        }
        return num ^ ~mask;
    }
}