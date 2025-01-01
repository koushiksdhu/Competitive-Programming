class Solution {
    public int maxScore(String s) {
        int mxSum = 0, l = 0, r = 0;

        for(char ch : s.toCharArray())
            r += ch == '1' ? 1 : 0;

        for(int i = 0; i < s.length()-1; i++) {
            l += s.charAt(i) == '0' ? 1 : 0;
            r += s.charAt(i) == '1' ? -1 : 0;
            mxSum = Math.max(mxSum, l + r);
        }
        return mxSum;
    }
}