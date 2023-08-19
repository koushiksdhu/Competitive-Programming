class Solution {
    public int maxDepth(String s) {
        int depth = 0, bracket = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                bracket++;
            else if(s.charAt(i) == ')')
                bracket--;
            depth = Math.max(depth, bracket);
        }
        return depth;
    }
}