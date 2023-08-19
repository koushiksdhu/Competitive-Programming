class Solution {
    public int maxDepth(String s) {
        int  d = 0, open = 0;
        for(char c : s.toCharArray()){
            if(c == '(')
                open++;
            else if(c == ')')
                open --;
            d = Math.max(d, open);
        }
        return d;
    }
}