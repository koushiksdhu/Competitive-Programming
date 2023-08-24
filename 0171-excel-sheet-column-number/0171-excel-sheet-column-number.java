class Solution {
    public int titleToNumber(String c) {
     
        int sum = 0;
        int n = 0;
        for(int i = 0; i < c.length(); i++){
            sum *= 26;
            sum += c.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}