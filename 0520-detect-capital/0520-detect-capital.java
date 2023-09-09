class Solution {
    public boolean detectCapitalUse(String words) {
        int cap = 0, small = 0;
        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) >= 'A' && words.charAt(i) <= 'Z')
                cap++;
            else if(words.charAt(i) >= 'a' && words.charAt(i) <= 'z')
                small++;
        }
        if(cap == 0 && small >= 0 || small == 0 && cap >= 0)
            return true;
        if(cap == 1 && words.charAt(0) <= 'Z')
            return true;
        return false;

    }
}