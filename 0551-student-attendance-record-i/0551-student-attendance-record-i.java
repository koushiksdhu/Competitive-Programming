class Solution {
    public boolean checkRecord(String s) {
        int a = 0, l = 1, lMax = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A')
                a++;
        }

        for(int i = 0; i < s.length(); i++){
            if(i+1 < s.length() && s.charAt(i) == 'L' && s.charAt(i) == s.charAt(i+1))
                l++;
            else{
                lMax = Math.max(lMax, l);
                l = 1;
            }
        }
        lMax = Math.max(lMax, l);
        return a < 2 && lMax < 3;
    }
}