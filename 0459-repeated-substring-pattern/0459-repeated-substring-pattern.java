class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1)
            return false;
            String str = s;
        for(int i = 0; i < s.length()/2; i++){
            str = str.substring(1, str.length()) + str.substring(0, 1);
            if(str.equals(s))
                return true;
        }
        return false;
    }
}