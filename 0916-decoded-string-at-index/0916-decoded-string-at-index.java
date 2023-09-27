class Solution {
    public String decodeAtIndex(String s, int k) {
        long len = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c))
                len *= c - '0';
            else
                len++;
        }

        for(int i = s.length()-1; i >= 0; i--){
            k %= len;
            if(k == 0 && !Character.isDigit(s.charAt(i)))
                return s.substring(i, i+1);
            if(Character.isDigit(s.charAt(i)))
                len /= s.charAt(i) - '0';
            else
                len--;
        }
        return s;
    }
}