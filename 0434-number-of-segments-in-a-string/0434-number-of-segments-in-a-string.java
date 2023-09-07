class Solution {
    public int countSegments(String s) {
        int count = 1;
        s = s.trim();
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
                count++;
        }
        return s.length() == 0 ? 0 : count;
    }
}